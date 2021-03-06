/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import webdsl.Application;
import webdsl.Code;
import webdsl.Front;
import webdsl.Language;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final Application application, @Extension final IFormattableDocument document) {
    EList<Code> _code = application.getCode();
    for (final Code code : _code) {
      document.<Code>format(code);
    }
  }
  
  protected void _format(final Front front, @Extension final IFormattableDocument document) {
    document.<Language>format(front.getLanguage());
  }
  
  public void format(final Object front, final IFormattableDocument document) {
    if (front instanceof XtextResource) {
      _format((XtextResource)front, document);
      return;
    } else if (front instanceof Front) {
      _format((Front)front, document);
      return;
    } else if (front instanceof Application) {
      _format((Application)front, document);
      return;
    } else if (front instanceof EObject) {
      _format((EObject)front, document);
      return;
    } else if (front == null) {
      _format((Void)null, document);
      return;
    } else if (front != null) {
      _format(front, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(front, document).toString());
    }
  }
}
