/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2003-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.referencing.datum;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;

import javax.measure.Unit;
import javax.measure.quantity.Angle;
import org.opengis.annotation.UML;
import org.opengis.referencing.IdentifiedObject;

/**
 * 本初子午线定义了确定经度值的原点。
 * {@link #getName name}初始值为“Greenwich”，当{@linkplain #getGreenwichLongitude greenwich longitude}值为零时，应使用该值。
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "CD_PrimeMeridian", specification = ISO_19111)
public interface PrimeMeridian extends IdentifiedObject {
    /**
     * 从格林威治子午线测量的本初子午线的经度，正向东。
     * {@code greenwichLongitude}初始值为零，当{@linkplain #getName 子午线名称}值为“Greenwich”时，应使用该值。
     *
     * @return 经络格林威治经度，位于{@linkplain #getAngularUnit angular unit}。
     */
    @UML(identifier = "greenwichLongitude", obligation = CONDITIONAL, specification = ISO_19111)
    double getGreenwichLongitude();

    /**
     * 返回{@linkplain #getGreenwichLongitude Greenwich 经度 }的角度单位。
     *
     * @return The angular unit of greenwich longitude.
     */
    @UML(identifier = "getAngularUnit", specification = OGC_01009)
    Unit<Angle> getAngularUnit();
}
