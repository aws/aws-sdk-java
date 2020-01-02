/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetailsForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventDetailsForOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * </p>
     */
    private java.util.List<EventAccountFilter> organizationEventDetailFilters;
    /**
     * <p>
     * The locale (language) to return information in. English (en) is the default and the only supported value at this
     * time.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * </p>
     * 
     * @return A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     */

    public java.util.List<EventAccountFilter> getOrganizationEventDetailFilters() {
        return organizationEventDetailFilters;
    }

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * </p>
     * 
     * @param organizationEventDetailFilters
     *        A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     */

    public void setOrganizationEventDetailFilters(java.util.Collection<EventAccountFilter> organizationEventDetailFilters) {
        if (organizationEventDetailFilters == null) {
            this.organizationEventDetailFilters = null;
            return;
        }

        this.organizationEventDetailFilters = new java.util.ArrayList<EventAccountFilter>(organizationEventDetailFilters);
    }

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationEventDetailFilters(java.util.Collection)} or
     * {@link #withOrganizationEventDetailFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationEventDetailFilters
     *        A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationRequest withOrganizationEventDetailFilters(EventAccountFilter... organizationEventDetailFilters) {
        if (this.organizationEventDetailFilters == null) {
            setOrganizationEventDetailFilters(new java.util.ArrayList<EventAccountFilter>(organizationEventDetailFilters.length));
        }
        for (EventAccountFilter ele : organizationEventDetailFilters) {
            this.organizationEventDetailFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * </p>
     * 
     * @param organizationEventDetailFilters
     *        A set of JSON elements that includes the <code>awsAccountId</code> and the <code>eventArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationRequest withOrganizationEventDetailFilters(java.util.Collection<EventAccountFilter> organizationEventDetailFilters) {
        setOrganizationEventDetailFilters(organizationEventDetailFilters);
        return this;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the default and the only supported value at this
     * time.
     * </p>
     * 
     * @param locale
     *        The locale (language) to return information in. English (en) is the default and the only supported value
     *        at this time.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the default and the only supported value at this
     * time.
     * </p>
     * 
     * @return The locale (language) to return information in. English (en) is the default and the only supported value
     *         at this time.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the default and the only supported value at this
     * time.
     * </p>
     * 
     * @param locale
     *        The locale (language) to return information in. English (en) is the default and the only supported value
     *        at this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationRequest withLocale(String locale) {
        setLocale(locale);
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
        if (getOrganizationEventDetailFilters() != null)
            sb.append("OrganizationEventDetailFilters: ").append(getOrganizationEventDetailFilters()).append(",");
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

        if (obj instanceof DescribeEventDetailsForOrganizationRequest == false)
            return false;
        DescribeEventDetailsForOrganizationRequest other = (DescribeEventDetailsForOrganizationRequest) obj;
        if (other.getOrganizationEventDetailFilters() == null ^ this.getOrganizationEventDetailFilters() == null)
            return false;
        if (other.getOrganizationEventDetailFilters() != null
                && other.getOrganizationEventDetailFilters().equals(this.getOrganizationEventDetailFilters()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationEventDetailFilters() == null) ? 0 : getOrganizationEventDetailFilters().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventDetailsForOrganizationRequest clone() {
        return (DescribeEventDetailsForOrganizationRequest) super.clone();
    }

}
