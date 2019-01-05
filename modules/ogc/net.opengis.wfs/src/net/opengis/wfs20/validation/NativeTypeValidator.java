/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link net.opengis.wfs20.NativeType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NativeTypeValidator {
  boolean validate();

  boolean validateMixed(FeatureMap value);
  boolean validateAny(FeatureMap value);
  boolean validateSafeToIgnore(boolean value);
  boolean validateVendorId(String value);
}
