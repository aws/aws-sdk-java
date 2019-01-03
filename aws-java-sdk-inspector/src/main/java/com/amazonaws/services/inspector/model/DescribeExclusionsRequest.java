/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeExclusions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExclusionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ARNs that specify the exclusions that you want to describe.
     * </p>
     */
    private java.util.List<String> exclusionArns;
    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * The list of ARNs that specify the exclusions that you want to describe.
     * </p>
     * 
     * @return The list of ARNs that specify the exclusions that you want to describe.
     */

    public java.util.List<String> getExclusionArns() {
        return exclusionArns;
    }

    /**
     * <p>
     * The list of ARNs that specify the exclusions that you want to describe.
     * </p>
     * 
     * @param exclusionArns
     *        The list of ARNs that specify the exclusions that you want to describe.
     */

    public void setExclusionArns(java.util.Collection<String> exclusionArns) {
        if (exclusionArns == null) {
            this.exclusionArns = null;
            return;
        }

        this.exclusionArns = new java.util.ArrayList<String>(exclusionArns);
    }

    /**
     * <p>
     * The list of ARNs that specify the exclusions that you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionArns(java.util.Collection)} or {@link #withExclusionArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param exclusionArns
     *        The list of ARNs that specify the exclusions that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExclusionsRequest withExclusionArns(String... exclusionArns) {
        if (this.exclusionArns == null) {
            setExclusionArns(new java.util.ArrayList<String>(exclusionArns.length));
        }
        for (String ele : exclusionArns) {
            this.exclusionArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ARNs that specify the exclusions that you want to describe.
     * </p>
     * 
     * @param exclusionArns
     *        The list of ARNs that specify the exclusions that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExclusionsRequest withExclusionArns(java.util.Collection<String> exclusionArns) {
        setExclusionArns(exclusionArns);
        return this;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @return The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public DescribeExclusionsRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale into which you want to translate the exclusion's title, description, and recommendation.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate the exclusion's title, description, and recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public DescribeExclusionsRequest withLocale(Locale locale) {
        this.locale = locale.toString();
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
        if (getExclusionArns() != null)
            sb.append("ExclusionArns: ").append(getExclusionArns()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExclusionsRequest == false)
            return false;
        DescribeExclusionsRequest other = (DescribeExclusionsRequest) obj;
        if (other.getExclusionArns() == null ^ this.getExclusionArns() == null)
            return false;
        if (other.getExclusionArns() != null && other.getExclusionArns().equals(this.getExclusionArns()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExclusionArns() == null) ? 0 : getExclusionArns().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExclusionsRequest clone() {
        return (DescribeExclusionsRequest) super.clone();
    }

}
