/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2005-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.renderer;

import org.opengis.feature.simple.SimpleFeature;

/**
 * A RenderListener is notified each time a feature is rendered and each time an error occurs during
 * rendering. Therefore <b>VERY LITTLE WORK</b> should be done in the listener!!!
 *
 * @author jeichar
 */
public interface RenderListener {

    /**
     * 监控指定的要素渲染过程
     * Reports that a specific feature has been rendered. The same feature might be reported
     * multiple times, if
     *
     * @param feature
     */
    public void featureRenderer(SimpleFeature feature);

    /**
     * 监控一个渲染错误。
     * 渲染通常不会停止在它上面，一个想要停止它的监听器可以调用{@link GTRenderer #stopRendering（）}
     *
     * @param e
     */
    public void errorOccurred(Exception e);
}
