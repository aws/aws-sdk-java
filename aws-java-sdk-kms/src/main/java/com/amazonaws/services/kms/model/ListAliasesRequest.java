/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @return Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *         does not return more than the specified number of items, but it might return fewer.</p>
     *         <p>
     *         This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *         include a value, it defaults to 50.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @param marker
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextMarker</code> from the truncated response you just received.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @return Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *         the value of <code>NextMarker</code> from the truncated response you just received.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @param marker
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextMarker</code> from the truncated response you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }

}
