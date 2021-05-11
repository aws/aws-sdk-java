/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribePage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the engagement to a contact channel.
     * </p>
     */
    private String pageId;

    /**
     * <p>
     * The ID of the engagement to a contact channel.
     * </p>
     * 
     * @param pageId
     *        The ID of the engagement to a contact channel.
     */

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * <p>
     * The ID of the engagement to a contact channel.
     * </p>
     * 
     * @return The ID of the engagement to a contact channel.
     */

    public String getPageId() {
        return this.pageId;
    }

    /**
     * <p>
     * The ID of the engagement to a contact channel.
     * </p>
     * 
     * @param pageId
     *        The ID of the engagement to a contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePageRequest withPageId(String pageId) {
        setPageId(pageId);
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
        if (getPageId() != null)
            sb.append("PageId: ").append(getPageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePageRequest == false)
            return false;
        DescribePageRequest other = (DescribePageRequest) obj;
        if (other.getPageId() == null ^ this.getPageId() == null)
            return false;
        if (other.getPageId() != null && other.getPageId().equals(this.getPageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageId() == null) ? 0 : getPageId().hashCode());
        return hashCode;
    }

    @Override
    public DescribePageRequest clone() {
        return (DescribePageRequest) super.clone();
    }

}
