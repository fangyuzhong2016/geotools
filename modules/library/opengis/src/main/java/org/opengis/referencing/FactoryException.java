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
 * 当{@linkplain Factory factory}无法创建请求对象的实例时抛出。
 * 它可能无法创建
 * {@linkplain org.opengis.referencing.datum.Datum datum}，
 * {@linkplain org.opengis.referencing.cs.CoordinateSystem coordinate system}，
 * {@linkplain org.opengis.referencing.ReferenceSystem reference system}
 * {@linkplain org.opengis.referencing.operation.CoordinateOperation 坐标操作}。
 *
 * <p>如果失败是由非法的授权代码引起的，那么实际的异常应该是
 * {@link NoSuchAuthorityCodeException}。
 * 否则，如果失败是由底层数据库中的某些错误引起的（例如{@link java.io.IOException}或{@link java.sql.SQLException}），
 * 那么应该指定错误异常
 *
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 * @see org.opengis.referencing.operation.CoordinateOperationFactory
 */
public class FactoryException extends Exception {
    /** 用于与不同版本互操作的序列号。 */
    private static final long serialVersionUID = -3414250034883898315L;

    /** 构造一个没有详细消息的异常。 */
    public FactoryException() {}

    /**
     *使用指定的详细消息构造异常。
     *
     * @param message 详细信息。保存详细消息以供以后通过{@link #getMessage()}方法检索。
     */
    public FactoryException(String message) {
        super(message);
    }

    /**
     *使用指定的原因构造一个异常。详细消息是从cause {@linkplain Exception#getLocalizedMessage 本地化消息}中复制的。
     *
     * @param cause 引起异常的原因cause , 保存原因以供以后通过{@link #getCause()}方法检索。
     */
    public FactoryException(Exception cause) {
        super(cause.getLocalizedMessage(), cause);
    }

    /**
     * 使用指定的详细消息和原因构造异常。
     * 原因是底层数据库中抛出的异常（例如{@link java.io.IOException}或{@link java.sql.SQLException}）。
     *
     * @param message 详细信息。保存详细消息以供以后通过{@link #getMessage()}方法检索。
     * @param cause 引起异常的原因cause , 保存原因以供以后通过{@link #getCause()}方法检索。
     */
    public FactoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
