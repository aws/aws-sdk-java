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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on
 * characteristics of your input video. This feature optimizes video quality while minimizing the overall size of your
 * ABR package.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AutomatedAbrSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomatedAbrSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your highest-quality rendition
     * will be equal to or below this value, depending on the quality, complexity, and resolution of your content. Note
     * that the instantaneous maximum bitrate may vary above the value that you specify.
     */
    private Integer maxAbrBitrate;
    /**
     * Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The number
     * of renditions is determined automatically, based on analysis of each job, but will never exceed this limit. When
     * you set this to Auto in the console, which is equivalent to excluding it from your JSON job specification,
     * MediaConvert defaults to a limit of 15.
     */
    private Integer maxRenditions;
    /**
     * Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your lowest-quality rendition will
     * be near this value. Note that the instantaneous minimum bitrate may vary below the value that you specify.
     */
    private Integer minAbrBitrate;
    /**
     * Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create in
     * your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements, but you
     * still want MediaConvert to optimize for video quality and overall file size.
     */
    private java.util.List<AutomatedAbrRule> rules;

    /**
     * Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your highest-quality rendition
     * will be equal to or below this value, depending on the quality, complexity, and resolution of your content. Note
     * that the instantaneous maximum bitrate may vary above the value that you specify.
     * 
     * @param maxAbrBitrate
     *        Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't
     *        specify a value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your
     *        highest-quality rendition will be equal to or below this value, depending on the quality, complexity, and
     *        resolution of your content. Note that the instantaneous maximum bitrate may vary above the value that you
     *        specify.
     */

    public void setMaxAbrBitrate(Integer maxAbrBitrate) {
        this.maxAbrBitrate = maxAbrBitrate;
    }

    /**
     * Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your highest-quality rendition
     * will be equal to or below this value, depending on the quality, complexity, and resolution of your content. Note
     * that the instantaneous maximum bitrate may vary above the value that you specify.
     * 
     * @return Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't
     *         specify a value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your
     *         highest-quality rendition will be equal to or below this value, depending on the quality, complexity, and
     *         resolution of your content. Note that the instantaneous maximum bitrate may vary above the value that you
     *         specify.
     */

    public Integer getMaxAbrBitrate() {
        return this.maxAbrBitrate;
    }

    /**
     * Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your highest-quality rendition
     * will be equal to or below this value, depending on the quality, complexity, and resolution of your content. Note
     * that the instantaneous maximum bitrate may vary above the value that you specify.
     * 
     * @param maxAbrBitrate
     *        Specify the maximum average bitrate for MediaConvert to use in your automated ABR stack. If you don't
     *        specify a value, MediaConvert uses 8,000,000 (8 mb/s) by default. The average bitrate of your
     *        highest-quality rendition will be equal to or below this value, depending on the quality, complexity, and
     *        resolution of your content. Note that the instantaneous maximum bitrate may vary above the value that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrSettings withMaxAbrBitrate(Integer maxAbrBitrate) {
        setMaxAbrBitrate(maxAbrBitrate);
        return this;
    }

    /**
     * Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The number
     * of renditions is determined automatically, based on analysis of each job, but will never exceed this limit. When
     * you set this to Auto in the console, which is equivalent to excluding it from your JSON job specification,
     * MediaConvert defaults to a limit of 15.
     * 
     * @param maxRenditions
     *        Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The
     *        number of renditions is determined automatically, based on analysis of each job, but will never exceed
     *        this limit. When you set this to Auto in the console, which is equivalent to excluding it from your JSON
     *        job specification, MediaConvert defaults to a limit of 15.
     */

    public void setMaxRenditions(Integer maxRenditions) {
        this.maxRenditions = maxRenditions;
    }

    /**
     * Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The number
     * of renditions is determined automatically, based on analysis of each job, but will never exceed this limit. When
     * you set this to Auto in the console, which is equivalent to excluding it from your JSON job specification,
     * MediaConvert defaults to a limit of 15.
     * 
     * @return Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The
     *         number of renditions is determined automatically, based on analysis of each job, but will never exceed
     *         this limit. When you set this to Auto in the console, which is equivalent to excluding it from your JSON
     *         job specification, MediaConvert defaults to a limit of 15.
     */

    public Integer getMaxRenditions() {
        return this.maxRenditions;
    }

    /**
     * Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The number
     * of renditions is determined automatically, based on analysis of each job, but will never exceed this limit. When
     * you set this to Auto in the console, which is equivalent to excluding it from your JSON job specification,
     * MediaConvert defaults to a limit of 15.
     * 
     * @param maxRenditions
     *        Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The
     *        number of renditions is determined automatically, based on analysis of each job, but will never exceed
     *        this limit. When you set this to Auto in the console, which is equivalent to excluding it from your JSON
     *        job specification, MediaConvert defaults to a limit of 15.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrSettings withMaxRenditions(Integer maxRenditions) {
        setMaxRenditions(maxRenditions);
        return this;
    }

    /**
     * Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your lowest-quality rendition will
     * be near this value. Note that the instantaneous minimum bitrate may vary below the value that you specify.
     * 
     * @param minAbrBitrate
     *        Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't
     *        specify a value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your
     *        lowest-quality rendition will be near this value. Note that the instantaneous minimum bitrate may vary
     *        below the value that you specify.
     */

    public void setMinAbrBitrate(Integer minAbrBitrate) {
        this.minAbrBitrate = minAbrBitrate;
    }

    /**
     * Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your lowest-quality rendition will
     * be near this value. Note that the instantaneous minimum bitrate may vary below the value that you specify.
     * 
     * @return Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't
     *         specify a value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your
     *         lowest-quality rendition will be near this value. Note that the instantaneous minimum bitrate may vary
     *         below the value that you specify.
     */

    public Integer getMinAbrBitrate() {
        return this.minAbrBitrate;
    }

    /**
     * Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't specify a
     * value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your lowest-quality rendition will
     * be near this value. Note that the instantaneous minimum bitrate may vary below the value that you specify.
     * 
     * @param minAbrBitrate
     *        Specify the minimum average bitrate for MediaConvert to use in your automated ABR stack. If you don't
     *        specify a value, MediaConvert uses 600,000 (600 kb/s) by default. The average bitrate of your
     *        lowest-quality rendition will be near this value. Note that the instantaneous minimum bitrate may vary
     *        below the value that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrSettings withMinAbrBitrate(Integer minAbrBitrate) {
        setMinAbrBitrate(minAbrBitrate);
        return this;
    }

    /**
     * Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create in
     * your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements, but you
     * still want MediaConvert to optimize for video quality and overall file size.
     * 
     * @return Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will
     *         create in your ABR stack. You can use these rules if your ABR workflow has specific rendition size
     *         requirements, but you still want MediaConvert to optimize for video quality and overall file size.
     */

    public java.util.List<AutomatedAbrRule> getRules() {
        return rules;
    }

    /**
     * Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create in
     * your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements, but you
     * still want MediaConvert to optimize for video quality and overall file size.
     * 
     * @param rules
     *        Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create
     *        in your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements,
     *        but you still want MediaConvert to optimize for video quality and overall file size.
     */

    public void setRules(java.util.Collection<AutomatedAbrRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AutomatedAbrRule>(rules);
    }

    /**
     * Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create in
     * your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements, but you
     * still want MediaConvert to optimize for video quality and overall file size.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create
     *        in your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements,
     *        but you still want MediaConvert to optimize for video quality and overall file size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrSettings withRules(AutomatedAbrRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<AutomatedAbrRule>(rules.length));
        }
        for (AutomatedAbrRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create in
     * your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements, but you
     * still want MediaConvert to optimize for video quality and overall file size.
     * 
     * @param rules
     *        Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create
     *        in your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements,
     *        but you still want MediaConvert to optimize for video quality and overall file size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedAbrSettings withRules(java.util.Collection<AutomatedAbrRule> rules) {
        setRules(rules);
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
        if (getMaxAbrBitrate() != null)
            sb.append("MaxAbrBitrate: ").append(getMaxAbrBitrate()).append(",");
        if (getMaxRenditions() != null)
            sb.append("MaxRenditions: ").append(getMaxRenditions()).append(",");
        if (getMinAbrBitrate() != null)
            sb.append("MinAbrBitrate: ").append(getMinAbrBitrate()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomatedAbrSettings == false)
            return false;
        AutomatedAbrSettings other = (AutomatedAbrSettings) obj;
        if (other.getMaxAbrBitrate() == null ^ this.getMaxAbrBitrate() == null)
            return false;
        if (other.getMaxAbrBitrate() != null && other.getMaxAbrBitrate().equals(this.getMaxAbrBitrate()) == false)
            return false;
        if (other.getMaxRenditions() == null ^ this.getMaxRenditions() == null)
            return false;
        if (other.getMaxRenditions() != null && other.getMaxRenditions().equals(this.getMaxRenditions()) == false)
            return false;
        if (other.getMinAbrBitrate() == null ^ this.getMinAbrBitrate() == null)
            return false;
        if (other.getMinAbrBitrate() != null && other.getMinAbrBitrate().equals(this.getMinAbrBitrate()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxAbrBitrate() == null) ? 0 : getMaxAbrBitrate().hashCode());
        hashCode = prime * hashCode + ((getMaxRenditions() == null) ? 0 : getMaxRenditions().hashCode());
        hashCode = prime * hashCode + ((getMinAbrBitrate() == null) ? 0 : getMinAbrBitrate().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public AutomatedAbrSettings clone() {
        try {
            return (AutomatedAbrSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AutomatedAbrSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
