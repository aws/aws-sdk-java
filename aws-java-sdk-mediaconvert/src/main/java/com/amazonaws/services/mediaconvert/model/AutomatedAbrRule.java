/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specify one or more Automated ABR rule types. Note: Force include and Allowed renditions are mutually exclusive.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AutomatedAbrRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomatedAbrRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to allowedRenditions list
     */
    private java.util.List<AllowedRenditionSize> allowedRenditions;
    /**
     * When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to forceIncludeRenditions list
     */
    private java.util.List<ForceIncludeRenditionSize> forceIncludeRenditions;
    /**
     * Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you
     * specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than,
     * or equal to, Min top rendition size.
     */
    private MinBottomRenditionSize minBottomRenditionSize;
    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution.
     */
    private MinTopRenditionSize minTopRenditionSize;
    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in
     * your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you
     * enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater
     * than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     * rendition size must be less than, or equal to, Min top rendition size. Use Force include renditions to specify one
     * or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few
     * resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than,
     * the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that
     * is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only
     * specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force
     * include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include
     * other resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions to
     * specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that you specify
     * must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an ABR stack exclusively
     * from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be
     * included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at
     * least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size
     * or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force
     * include renditions.
     */
    private String type;

    /**
     * When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to allowedRenditions list
     * 
     * @return When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     *         rendition to allowedRenditions list
     */

    public java.util.List<AllowedRenditionSize> getAllowedRenditions() {
        return allowedRenditions;
    }

    /**
     * When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to allowedRenditions list
     * 
     * @param allowedRenditions
     *        When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     *        rendition to allowedRenditions list
     */

    public void setAllowedRenditions(java.util.Collection<AllowedRenditionSize> allowedRenditions) {
        if (allowedRenditions == null) {
            this.allowedRenditions = null;
            return;
        }

        this.allowedRenditions = new java.util.ArrayList<AllowedRenditionSize>(allowedRenditions);
    }

    /**
     * When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to allowedRenditions list
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedRenditions(java.util.Collection)} or {@link #withAllowedRenditions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedRenditions
     *        When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     *        rendition to allowedRenditions list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrRule withAllowedRenditions(AllowedRenditionSize... allowedRenditions) {
        if (this.allowedRenditions == null) {
            setAllowedRenditions(new java.util.ArrayList<AllowedRenditionSize>(allowedRenditions.length));
        }
        for (AllowedRenditionSize ele : allowedRenditions) {
            this.allowedRenditions.add(ele);
        }
        return this;
    }

    /**
     * When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to allowedRenditions list
     * 
     * @param allowedRenditions
     *        When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one
     *        rendition to allowedRenditions list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrRule withAllowedRenditions(java.util.Collection<AllowedRenditionSize> allowedRenditions) {
        setAllowedRenditions(allowedRenditions);
        return this;
    }

    /**
     * When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to forceIncludeRenditions list
     * 
     * @return When customer adds the force include renditions rule for auto ABR ladder, they are required to add at
     *         leat one rendition to forceIncludeRenditions list
     */

    public java.util.List<ForceIncludeRenditionSize> getForceIncludeRenditions() {
        return forceIncludeRenditions;
    }

    /**
     * When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to forceIncludeRenditions list
     * 
     * @param forceIncludeRenditions
     *        When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat
     *        one rendition to forceIncludeRenditions list
     */

    public void setForceIncludeRenditions(java.util.Collection<ForceIncludeRenditionSize> forceIncludeRenditions) {
        if (forceIncludeRenditions == null) {
            this.forceIncludeRenditions = null;
            return;
        }

        this.forceIncludeRenditions = new java.util.ArrayList<ForceIncludeRenditionSize>(forceIncludeRenditions);
    }

    /**
     * When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to forceIncludeRenditions list
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForceIncludeRenditions(java.util.Collection)} or
     * {@link #withForceIncludeRenditions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param forceIncludeRenditions
     *        When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat
     *        one rendition to forceIncludeRenditions list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrRule withForceIncludeRenditions(ForceIncludeRenditionSize... forceIncludeRenditions) {
        if (this.forceIncludeRenditions == null) {
            setForceIncludeRenditions(new java.util.ArrayList<ForceIncludeRenditionSize>(forceIncludeRenditions.length));
        }
        for (ForceIncludeRenditionSize ele : forceIncludeRenditions) {
            this.forceIncludeRenditions.add(ele);
        }
        return this;
    }

    /**
     * When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat one
     * rendition to forceIncludeRenditions list
     * 
     * @param forceIncludeRenditions
     *        When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat
     *        one rendition to forceIncludeRenditions list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrRule withForceIncludeRenditions(java.util.Collection<ForceIncludeRenditionSize> forceIncludeRenditions) {
        setForceIncludeRenditions(forceIncludeRenditions);
        return this;
    }

    /**
     * Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you
     * specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than,
     * or equal to, Min top rendition size.
     * 
     * @param minBottomRenditionSize
     *        Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The
     *        lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than
     *        to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     *        rendition size must be less than, or equal to, Min top rendition size.
     */

    public void setMinBottomRenditionSize(MinBottomRenditionSize minBottomRenditionSize) {
        this.minBottomRenditionSize = minBottomRenditionSize;
    }

    /**
     * Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you
     * specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than,
     * or equal to, Min top rendition size.
     * 
     * @return Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. *
     *         The lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *         example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than
     *         to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     *         rendition size must be less than, or equal to, Min top rendition size.
     */

    public MinBottomRenditionSize getMinBottomRenditionSize() {
        return this.minBottomRenditionSize;
    }

    /**
     * Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you
     * specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than,
     * or equal to, Min top rendition size.
     * 
     * @param minBottomRenditionSize
     *        Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The
     *        lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than
     *        to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     *        rendition size must be less than, or equal to, Min top rendition size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrRule withMinBottomRenditionSize(MinBottomRenditionSize minBottomRenditionSize) {
        setMinBottomRenditionSize(minBottomRenditionSize);
        return this;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution.
     * 
     * @param minTopRenditionSize
     *        Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *        highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than
     *        1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition
     *        size must be less than, or equal to, Max resolution.
     */

    public void setMinTopRenditionSize(MinTopRenditionSize minTopRenditionSize) {
        this.minTopRenditionSize = minTopRenditionSize;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution.
     * 
     * @return Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *         highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *         example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater
     *         than 1280x720. * If you specify a value for Max resolution, the value that you specify for Min top
     *         rendition size must be less than, or equal to, Max resolution.
     */

    public MinTopRenditionSize getMinTopRenditionSize() {
        return this.minTopRenditionSize;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution.
     * 
     * @param minTopRenditionSize
     *        Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *        highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than
     *        1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition
     *        size must be less than, or equal to, Max resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrRule withMinTopRenditionSize(MinTopRenditionSize minTopRenditionSize) {
        setMinTopRenditionSize(minTopRenditionSize);
        return this;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in
     * your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you
     * enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater
     * than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     * rendition size must be less than, or equal to, Min top rendition size. Use Force include renditions to specify one
     * or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few
     * resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than,
     * the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that
     * is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only
     * specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force
     * include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include
     * other resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions to
     * specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that you specify
     * must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an ABR stack exclusively
     * from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be
     * included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at
     * least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size
     * or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force
     * include renditions.
     * 
     * @param type
     *        Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *        highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than
     *        1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition
     *        size must be less than, or equal to, Max resolution. Use Min bottom rendition size to specify a minimum
     *        size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal
     *        to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in
     *        your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size
     *        rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top
     *        rendition size. Use Force include renditions to specify one or more resolutions to include your ABR stack.
     *        * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number
     *        of resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you
     *        specify a Min top rendition size rule, specify at least one resolution that is equal to, or greater than,
     *        Min top rendition size. * If you specify a Min bottom rendition size rule, only specify resolutions that
     *        are equal to, or greater than, Min bottom rendition size. * If you specify a Force include renditions
     *        rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include other
     *        resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions
     *        to specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that
     *        you specify must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an
     *        ABR stack exclusively from the list of resolutions that you specify. * Some resolutions in the Allowed
     *        renditions list may not be included, however you can force a resolution to be included by setting Required
     *        to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions
     *        that you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed
     *        renditions, you must not specify a separate rule for Force include renditions.
     * @see RuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in
     * your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you
     * enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater
     * than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     * rendition size must be less than, or equal to, Min top rendition size. Use Force include renditions to specify one
     * or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few
     * resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than,
     * the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that
     * is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only
     * specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force
     * include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include
     * other resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions to
     * specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that you specify
     * must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an ABR stack exclusively
     * from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be
     * included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at
     * least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size
     * or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force
     * include renditions.
     * 
     * @return Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *         highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *         example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater
     *         than 1280x720. * If you specify a value for Max resolution, the value that you specify for Min top
     *         rendition size must be less than, or equal to, Max resolution. Use Min bottom rendition size to specify a
     *         minimum size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will
     *         be equal to or greater than the value that you enter. For example: If you specify 640x360 the lowest
     *         resolution in your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top
     *         rendition size rule, the value that you specify for Min bottom rendition size must be less than, or equal
     *         to, Min top rendition size. Use Force include renditions to specify one or more resolutions to include
     *         your ABR stack. * (Recommended) To optimize automated ABR, specify as few resolutions as possible. *
     *         (Required) The number of resolutions that you specify must be equal to, or less than, the Max renditions
     *         setting. * If you specify a Min top rendition size rule, specify at least one resolution that is equal
     *         to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only
     *         specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a
     *         Force include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR
     *         stack may include other resolutions that you do not specify here, depending on the Max renditions
     *         setting. Use Allowed renditions to specify a list of possible resolutions in your ABR stack. * (Required)
     *         The number of resolutions that you specify must be equal to, or greater than, the Max renditions setting.
     *         * MediaConvert will create an ABR stack exclusively from the list of resolutions that you specify. * Some
     *         resolutions in the Allowed renditions list may not be included, however you can force a resolution to be
     *         included by setting Required to ENABLED. * You must specify at least one resolution that is greater than
     *         or equal to any resolutions that you specify in Min top rendition size or Min bottom rendition size. * If
     *         you specify Allowed renditions, you must not specify a separate rule for Force include renditions.
     * @see RuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in
     * your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you
     * enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater
     * than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     * rendition size must be less than, or equal to, Min top rendition size. Use Force include renditions to specify one
     * or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few
     * resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than,
     * the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that
     * is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only
     * specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force
     * include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include
     * other resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions to
     * specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that you specify
     * must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an ABR stack exclusively
     * from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be
     * included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at
     * least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size
     * or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force
     * include renditions.
     * 
     * @param type
     *        Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *        highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than
     *        1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition
     *        size must be less than, or equal to, Max resolution. Use Min bottom rendition size to specify a minimum
     *        size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal
     *        to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in
     *        your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size
     *        rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top
     *        rendition size. Use Force include renditions to specify one or more resolutions to include your ABR stack.
     *        * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number
     *        of resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you
     *        specify a Min top rendition size rule, specify at least one resolution that is equal to, or greater than,
     *        Min top rendition size. * If you specify a Min bottom rendition size rule, only specify resolutions that
     *        are equal to, or greater than, Min bottom rendition size. * If you specify a Force include renditions
     *        rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include other
     *        resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions
     *        to specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that
     *        you specify must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an
     *        ABR stack exclusively from the list of resolutions that you specify. * Some resolutions in the Allowed
     *        renditions list may not be included, however you can force a resolution to be included by setting Required
     *        to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions
     *        that you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed
     *        renditions, you must not specify a separate rule for Force include renditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public AutomatedAbrRule withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest
     * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you
     * specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you
     * specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or
     * equal to, Max resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in
     * your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you
     * enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater
     * than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom
     * rendition size must be less than, or equal to, Min top rendition size. Use Force include renditions to specify one
     * or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few
     * resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than,
     * the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that
     * is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only
     * specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force
     * include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include
     * other resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions to
     * specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that you specify
     * must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an ABR stack exclusively
     * from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be
     * included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at
     * least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size
     * or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force
     * include renditions.
     * 
     * @param type
     *        Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The
     *        highest resolution in your ABR stack will be equal to or greater than the value that you enter. For
     *        example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than
     *        1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition
     *        size must be less than, or equal to, Max resolution. Use Min bottom rendition size to specify a minimum
     *        size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal
     *        to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in
     *        your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size
     *        rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top
     *        rendition size. Use Force include renditions to specify one or more resolutions to include your ABR stack.
     *        * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number
     *        of resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you
     *        specify a Min top rendition size rule, specify at least one resolution that is equal to, or greater than,
     *        Min top rendition size. * If you specify a Min bottom rendition size rule, only specify resolutions that
     *        are equal to, or greater than, Min bottom rendition size. * If you specify a Force include renditions
     *        rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include other
     *        resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions
     *        to specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that
     *        you specify must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an
     *        ABR stack exclusively from the list of resolutions that you specify. * Some resolutions in the Allowed
     *        renditions list may not be included, however you can force a resolution to be included by setting Required
     *        to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions
     *        that you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed
     *        renditions, you must not specify a separate rule for Force include renditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public AutomatedAbrRule withType(RuleType type) {
        this.type = type.toString();
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
        if (getAllowedRenditions() != null)
            sb.append("AllowedRenditions: ").append(getAllowedRenditions()).append(",");
        if (getForceIncludeRenditions() != null)
            sb.append("ForceIncludeRenditions: ").append(getForceIncludeRenditions()).append(",");
        if (getMinBottomRenditionSize() != null)
            sb.append("MinBottomRenditionSize: ").append(getMinBottomRenditionSize()).append(",");
        if (getMinTopRenditionSize() != null)
            sb.append("MinTopRenditionSize: ").append(getMinTopRenditionSize()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomatedAbrRule == false)
            return false;
        AutomatedAbrRule other = (AutomatedAbrRule) obj;
        if (other.getAllowedRenditions() == null ^ this.getAllowedRenditions() == null)
            return false;
        if (other.getAllowedRenditions() != null && other.getAllowedRenditions().equals(this.getAllowedRenditions()) == false)
            return false;
        if (other.getForceIncludeRenditions() == null ^ this.getForceIncludeRenditions() == null)
            return false;
        if (other.getForceIncludeRenditions() != null && other.getForceIncludeRenditions().equals(this.getForceIncludeRenditions()) == false)
            return false;
        if (other.getMinBottomRenditionSize() == null ^ this.getMinBottomRenditionSize() == null)
            return false;
        if (other.getMinBottomRenditionSize() != null && other.getMinBottomRenditionSize().equals(this.getMinBottomRenditionSize()) == false)
            return false;
        if (other.getMinTopRenditionSize() == null ^ this.getMinTopRenditionSize() == null)
            return false;
        if (other.getMinTopRenditionSize() != null && other.getMinTopRenditionSize().equals(this.getMinTopRenditionSize()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedRenditions() == null) ? 0 : getAllowedRenditions().hashCode());
        hashCode = prime * hashCode + ((getForceIncludeRenditions() == null) ? 0 : getForceIncludeRenditions().hashCode());
        hashCode = prime * hashCode + ((getMinBottomRenditionSize() == null) ? 0 : getMinBottomRenditionSize().hashCode());
        hashCode = prime * hashCode + ((getMinTopRenditionSize() == null) ? 0 : getMinTopRenditionSize().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AutomatedAbrRule clone() {
        try {
            return (AutomatedAbrRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AutomatedAbrRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
