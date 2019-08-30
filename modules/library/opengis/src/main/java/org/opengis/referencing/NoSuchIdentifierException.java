/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2003-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.referencing;

/**
 * 当使用未知{@linkplain org.opengis.referencing.operation.OperationMethod 操作方法}
 * 请求标识符{@linkplain org.opengis.referencing.operation.MathTransform 数学转换}时抛出。
 *
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 * @see org.opengis.referencing.operation.MathTransformFactory#createParameterizedTransform
 */
public class NoSuchIdentifierException extends FactoryException {
    /** Serial number for interoperability with different versions. */
    private static final long serialVersionUID = -6846799994429345902L;


    private final String identifier;

    /**
     * 使用指定的详细消息和分类名称构造异常。
     *
     * @param message 详细信息。保存详细消息以供以后通过{@link #getMessage()}方法检索。
     * @param identifier {@linkplain ReferenceIdentifier#getCode identifier code}.
     */
    public NoSuchIdentifierException(final String message, final String identifier) {
        super(message);
        this.identifier = identifier;
    }

    /**
     * Returns the {@linkplain ReferenceIdentifier#getCode identifier code}.
     *
     * @return The identifier code.
     */
    public String getIdentifierCode() {
        return identifier;
    }
}
