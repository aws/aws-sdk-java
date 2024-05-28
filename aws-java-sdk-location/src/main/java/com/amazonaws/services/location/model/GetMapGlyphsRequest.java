/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapGlyphs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMapGlyphsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference. For example,
     * <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     * <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Light</code>
     * | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     * <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> | <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     * <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     * Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     * <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     * <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> | <code>Noto Sans Medium</code>
     * | <code>Noto Sans Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open
     * Data</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     * VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     * <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     * <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most glyphs
     * but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     * </p>
     * </note>
     */
    private String fontStack;
    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     */
    private String fontUnicodeRange;
    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     */
    private String mapName;

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference. For example,
     * <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     * <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Light</code>
     * | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     * <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> | <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     * <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     * Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     * <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     * <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> | <code>Noto Sans Medium</code>
     * | <code>Noto Sans Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open
     * Data</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     * VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     * <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     * <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most glyphs
     * but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     * </p>
     * </note>
     * 
     * @param fontStack
     *        A comma-separated list of fonts to load glyphs from in order of preference. For example,
     *        <code>Noto Sans Regular, Arial Unicode</code>.</p>
     *        <p>
     *        Valid font stacks for <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     *        <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> |
     *        <code>Ubuntu Light</code> | <code>Ubuntu Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     *        <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> | <code>Roboto Condensed Light Italic</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     *        <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     *        Technologies</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     *        <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     *        <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid font stacks for <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> |
     *        <code>Noto Sans Medium</code> | <code>Noto Sans Bold</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid font stacks for <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     *        VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     *        <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     *        <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     *        <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     *        <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     *        <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     *        <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     *        <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     *        <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     *        <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     *        <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most
     *        glyphs but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     *        </p>
     */

    public void setFontStack(String fontStack) {
        this.fontStack = fontStack;
    }

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference. For example,
     * <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     * <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Light</code>
     * | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     * <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> | <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     * <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     * Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     * <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     * <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> | <code>Noto Sans Medium</code>
     * | <code>Noto Sans Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open
     * Data</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     * VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     * <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     * <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most glyphs
     * but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     * </p>
     * </note>
     * 
     * @return A comma-separated list of fonts to load glyphs from in order of preference. For example,
     *         <code>Noto Sans Regular, Arial Unicode</code>.</p>
     *         <p>
     *         Valid font stacks for <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     *         <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> |
     *         <code>Ubuntu Light</code> | <code>Ubuntu Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     *         <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> |
     *         <code>Roboto Condensed Light Italic</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     *         <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     *         Technologies</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     *         <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     *         <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid font stacks for <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> |
     *         <code>Noto Sans Medium</code> | <code>Noto Sans Bold</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid font stacks for <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     *         VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     *         <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     *         <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     *         <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     *         <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     *         <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     *         <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     *         <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     *         <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     *         <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     *         <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most
     *         glyphs but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     *         </p>
     */

    public String getFontStack() {
        return this.fontStack;
    }

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference. For example,
     * <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     * <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Light</code>
     * | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     * <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> | <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     * <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     * Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     * <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     * <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a>
     * styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> | <code>Noto Sans Medium</code>
     * | <code>Noto Sans Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open
     * Data</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     * VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     * <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     * <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     * <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     * <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     * <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most glyphs
     * but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     * </p>
     * </note>
     * 
     * @param fontStack
     *        A comma-separated list of fonts to load glyphs from in order of preference. For example,
     *        <code>Noto Sans Regular, Arial Unicode</code>.</p>
     *        <p>
     *        Valid font stacks for <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> | <code>Ubuntu Medium</code> |
     *        <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> | <code>Ubuntu Regular</code> |
     *        <code>Ubuntu Light</code> | <code>Ubuntu Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriTopographic – <code>Noto Sans Italic</code> | <code>Noto Sans Regular</code> |
     *        <code>Noto Sans Bold</code> | <code>Noto Serif Regular</code> | <code>Roboto Condensed Light Italic</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriStreets – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorEsriNavigation – <code>Arial Regular</code> | <code>Arial Italic</code> | <code>Arial Bold</code> |
     *        <code>Arial Unicode MS Bold</code> | <code>Arial Unicode MS Regular</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid font stacks for <a href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE
     *        Technologies</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorHereContrast – <code>Fira GO Regular</code> | <code>Fira GO Bold</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VectorHereExplore, VectorHereExploreTruck, HybridHereExploreSatellite – <code>Fira GO Italic</code> |
     *        <code>Fira GO Map</code> | <code>Fira GO Map Bold</code> | <code>Noto Sans CJK JP Bold</code> |
     *        <code>Noto Sans CJK JP Light</code> | <code>Noto Sans CJK JP Regular</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid font stacks for <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/grab.html">GrabMaps</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorGrabStandardLight, VectorGrabStandardDark – <code>Noto Sans Regular</code> |
     *        <code>Noto Sans Medium</code> | <code>Noto Sans Bold</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid font stacks for <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/open-data.html">Open Data</a> styles:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        VectorOpenDataStandardLight, VectorOpenDataStandardDark, VectorOpenDataVisualizationLight,
     *        VectorOpenDataVisualizationDark – <code>Amazon Ember Regular,Noto Sans Regular</code> |
     *        <code>Amazon Ember Bold,Noto Sans Bold</code> | <code>Amazon Ember Medium,Noto Sans Medium</code> |
     *        <code>Amazon Ember Regular Italic,Noto Sans Italic</code> |
     *        <code>Amazon Ember Condensed RC Regular,Noto Sans Regular</code> |
     *        <code>Amazon Ember Condensed RC Bold,Noto Sans Bold</code> |
     *        <code>Amazon Ember Regular,Noto Sans Regular,Noto Sans Arabic Regular</code> |
     *        <code>Amazon Ember Condensed RC Bold,Noto Sans Bold,Noto Sans Arabic Condensed Bold</code> |
     *        <code>Amazon Ember Bold,Noto Sans Bold,Noto Sans Arabic Bold</code> |
     *        <code>Amazon Ember Regular Italic,Noto Sans Italic,Noto Sans Arabic Regular</code> |
     *        <code>Amazon Ember Condensed RC Regular,Noto Sans Regular,Noto Sans Arabic Condensed Regular</code> |
     *        <code>Amazon Ember Medium,Noto Sans Medium,Noto Sans Arabic Medium</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The fonts used by the Open Data map styles are combined fonts that use <code>Amazon Ember</code> for most
     *        glyphs but <code>Noto Sans</code> for glyphs unsupported by <code>Amazon Ember</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withFontStack(String fontStack) {
        setFontStack(fontStack);
        return this;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     * 
     * @param fontUnicodeRange
     *        A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For
     *        example, 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be
     *        aligned to multiples of 256.
     */

    public void setFontUnicodeRange(String fontUnicodeRange) {
        this.fontUnicodeRange = fontUnicodeRange;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     * 
     * @return A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For
     *         example, 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be
     *         aligned to multiples of 256.
     */

    public String getFontUnicodeRange() {
        return this.fontUnicodeRange;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     * 
     * @param fontUnicodeRange
     *        A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For
     *        example, 0–255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be
     *        aligned to multiples of 256.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withFontUnicodeRange(String fontUnicodeRange) {
        setFontUnicodeRange(fontUnicodeRange);
        return this;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @param key
     *        The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *        key</a> to authorize the request.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @return The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *         key</a> to authorize the request.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @param key
     *        The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *        key</a> to authorize the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * 
     * @param mapName
     *        The map resource associated with the glyph ﬁle.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * 
     * @return The map resource associated with the glyph ﬁle.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * 
     * @param mapName
     *        The map resource associated with the glyph ﬁle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withMapName(String mapName) {
        setMapName(mapName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFontStack() != null)
            sb.append("FontStack: ").append(getFontStack()).append(",");
        if (getFontUnicodeRange() != null)
            sb.append("FontUnicodeRange: ").append(getFontUnicodeRange()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapGlyphsRequest == false)
            return false;
        GetMapGlyphsRequest other = (GetMapGlyphsRequest) obj;
        if (other.getFontStack() == null ^ this.getFontStack() == null)
            return false;
        if (other.getFontStack() != null && other.getFontStack().equals(this.getFontStack()) == false)
            return false;
        if (other.getFontUnicodeRange() == null ^ this.getFontUnicodeRange() == null)
            return false;
        if (other.getFontUnicodeRange() != null && other.getFontUnicodeRange().equals(this.getFontUnicodeRange()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontStack() == null) ? 0 : getFontStack().hashCode());
        hashCode = prime * hashCode + ((getFontUnicodeRange() == null) ? 0 : getFontUnicodeRange().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        return hashCode;
    }

    @Override
    public GetMapGlyphsRequest clone() {
        return (GetMapGlyphsRequest) super.clone();
    }

}
