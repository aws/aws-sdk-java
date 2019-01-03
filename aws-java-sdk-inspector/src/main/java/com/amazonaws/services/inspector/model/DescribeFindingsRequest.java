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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the finding that you want to describe.
     * </p>
     */
    private java.util.List<String> findingArns;
    /**
     * <p>
     * The locale into which you want to translate a finding description, recommendation, and the short description that
     * identifies the finding.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * The ARN that specifies the finding that you want to describe.
     * </p>
     * 
     * @return The ARN that specifies the finding that you want to describe.
     */

    public java.util.List<String> getFindingArns() {
        return findingArns;
    }

    /**
     * <p>
     * The ARN that specifies the finding that you want to describe.
     * </p>
     * 
     * @param findingArns
     *        The ARN that specifies the finding that you want to describe.
     */

    public void setFindingArns(java.util.Collection<String> findingArns) {
        if (findingArns == null) {
            this.findingArns = null;
            return;
        }

        this.findingArns = new java.util.ArrayList<String>(findingArns);
    }

    /**
     * <p>
     * The ARN that specifies the finding that you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingArns(java.util.Collection)} or {@link #withFindingArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingArns
     *        The ARN that specifies the finding that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFindingsRequest withFindingArns(String... findingArns) {
        if (this.findingArns == null) {
            setFindingArns(new java.util.ArrayList<String>(findingArns.length));
        }
        for (String ele : findingArns) {
            this.findingArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN that specifies the finding that you want to describe.
     * </p>
     * 
     * @param findingArns
     *        The ARN that specifies the finding that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFindingsRequest withFindingArns(java.util.Collection<String> findingArns) {
        setFindingArns(findingArns);
        return this;
    }

    /**
     * <p>
     * The locale into which you want to translate a finding description, recommendation, and the short description that
     * identifies the finding.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate a finding description, recommendation, and the short
     *        description that identifies the finding.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale into which you want to translate a finding description, recommendation, and the short description that
     * identifies the finding.
     * </p>
     * 
     * @return The locale into which you want to translate a finding description, recommendation, and the short
     *         description that identifies the finding.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale into which you want to translate a finding description, recommendation, and the short description that
     * identifies the finding.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate a finding description, recommendation, and the short
     *        description that identifies the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public DescribeFindingsRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale into which you want to translate a finding description, recommendation, and the short description that
     * identifies the finding.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate a finding description, recommendation, and the short
     *        description that identifies the finding.
     * @see Locale
     */

    public void setLocale(Locale locale) {
        withLocale(locale);
    }

    /**
     * <p>
     * The locale into which you want to translate a finding description, recommendation, and the short description that
     * identifies the finding.
     * </p>
     * 
     * @param locale
     *        The locale into which you want to translate a finding description, recommendation, and the short
     *        description that identifies the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public DescribeFindingsRequest withLocale(Locale locale) {
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
        if (getFindingArns() != null)
            sb.append("FindingArns: ").append(getFindingArns()).append(",");
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

        if (obj instanceof DescribeFindingsRequest == false)
            return false;
        DescribeFindingsRequest other = (DescribeFindingsRequest) obj;
        if (other.getFindingArns() == null ^ this.getFindingArns() == null)
            return false;
        if (other.getFindingArns() != null && other.getFindingArns().equals(this.getFindingArns()) == false)
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

        hashCode = prime * hashCode + ((getFindingArns() == null) ? 0 : getFindingArns().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFindingsRequest clone() {
        return (DescribeFindingsRequest) super.clone();
    }

}
