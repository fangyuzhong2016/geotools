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
 * 当{@linkplain AuthorityFactory authority factory}无法找到请求的权限代码时抛出。
 *  
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 * @see org.opengis.referencing.datum.DatumAuthorityFactory
 * @see org.opengis.referencing.crs.CRSAuthorityFactory
 */
public class NoSuchAuthorityCodeException extends FactoryException {
    /**用于与不同版本互操作的序列号。 */
    private static final long serialVersionUID = -1573748311981746573L;

    /** The authority. */
    private final String authority;

    /** The invalid authority code. */
    private final String code;

    /**
     * 使用指定的详细消息和授权代码构造异常。
     *
     * @param message 详细信息。保存详细消息以供以后通过{@link #getMessage()}方法检索。
     * @param authority The authority.
     * @param code The invalid authority code.
     */
    public NoSuchAuthorityCodeException(String message, String authority, String code) {
        super(message);
        this.authority = authority;
        this.code = code;
    }

    /**
     * Returns the authority.
     *
     * @return The authority, or {@code null} if unknown.
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Returns the invalid authority code.
     *
     * @return The authority code, or {@code null} if unknown.
     */
    public String getAuthorityCode() {
        return code;
    }
}
