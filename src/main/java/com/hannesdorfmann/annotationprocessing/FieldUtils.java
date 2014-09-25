package com.hannesdorfmann.annotationprocessing;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;

/**
 * A collection of utils for class fields
 *
 * @author Hannes Dorfmann
 */
public class FieldUtils {

  /**
   * Is the element a field?
   */
  public static boolean isField(Element element) {
    return element.getKind() == ElementKind.FIELD;
  }
}
