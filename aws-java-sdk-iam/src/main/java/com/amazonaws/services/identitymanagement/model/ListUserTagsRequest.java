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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListUserTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user whose tags you want to see.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate where the next
     * call should start.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the
     * response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * more results are available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>
     * , and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The name of the IAM user whose tags you want to see.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user whose tags you want to see.</p>
     *        <p>
     *        This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: =,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user whose tags you want to see.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     * 
     * @return The name of the IAM user whose tags you want to see.</p>
     *         <p>
     *         This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: =,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user whose tags you want to see.
     * </p>
     * <p>
     * This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any
     * of the following characters: =,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user whose tags you want to see.</p>
     *        <p>
     *        This parameter accepts (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserTagsRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate where the next
     * call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate
     *        where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate where the next
     * call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate
     *         where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate where the next
     * call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response to indicate
     *        where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserTagsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the
     * response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * more results are available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>
     * , and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Use this only when paginating results to indicate the maximum number of items that you want in
     *        the response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code>
     *        response element is <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *        when more results are available. In that case, the <code>IsTruncated</code> response element returns
     *        <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     *        the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the
     * response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * more results are available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>
     * , and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @return (Optional) Use this only when paginating results to indicate the maximum number of items that you want in
     *         the response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code>
     *         response element is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *         when more results are available. In that case, the <code>IsTruncated</code> response element returns
     *         <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     *         the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the
     * response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * more results are available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>
     * , and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Use this only when paginating results to indicate the maximum number of items that you want in
     *        the response. If additional items exist beyond the maximum that you specify, the <code>IsTruncated</code>
     *        response element is <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *        when more results are available. In that case, the <code>IsTruncated</code> response element returns
     *        <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     *        the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserTagsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserTagsRequest == false)
            return false;
        ListUserTagsRequest other = (ListUserTagsRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListUserTagsRequest clone() {
        return (ListUserTagsRequest) super.clone();
    }

}
