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

import org.opengis.annotation.UML;

/**
 * 定义图像坐标参考系的原点。图像数据仅用于本地上下文。
 * 对于图像数据，锚点通常是图像的中心或图像的角。
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "CD_ImageDatum", specification = ISO_19111)
public interface ImageDatum extends Datum {
    /**
     * 指定图像网格与图像数据属性相关联的方式。
     *
     * @return 图像网格与图像数据属性相关联的方式。
     */
    @UML(identifier = "pixelInCell", obligation = MANDATORY, specification = ISO_19111)
    PixelInCell getPixelInCell();
}
