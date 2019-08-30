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

import java.util.Date;
import org.opengis.annotation.UML;
import org.opengis.util.InternationalString;

/**
 * 时间数据定义时间坐标参考系统的原点。
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "CD_TemporalDatum", specification = ISO_19111)
public interface TemporalDatum extends Datum {
    /**
     * 此时态数据的日期和时间原点。
     *
     * @return 此时态数据的日期和时间原点。
     */
    @UML(identifier = "origin", obligation = MANDATORY, specification = ISO_19111)
    Date getOrigin();

    /**
     * 此属性在{@link Datum}父接口中定义，但不被 temporal数据使用。
     *
     * @return Always {@code null}.
     */
    @UML(identifier = "anchorPoint", obligation = FORBIDDEN, specification = ISO_19111)
    InternationalString getAnchorPoint();

    /**
     * 此属性在{@link Datum}父接口中定义，但不被temporal数据使用。
     *
     * @return Always {@code null}.
     */
    @UML(identifier = "realizationEpoch", obligation = FORBIDDEN, specification = ISO_19111)
    Date getRealizationEpoch();
}
