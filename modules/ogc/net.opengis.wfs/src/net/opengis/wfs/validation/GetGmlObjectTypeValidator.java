/**
 *
 * $Id$
 */
package net.opengis.wfs.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link net.opengis.wfs.GetGmlObjectType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GetGmlObjectTypeValidator {
  boolean validate();

  boolean validateGmlObjectId(Object value);
  boolean validateOutputFormat(String value);
  boolean validateTraverseXlinkDepth(String value);
  boolean validateTraverseXlinkExpiry(BigInteger value);
}
