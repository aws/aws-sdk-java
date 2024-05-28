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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegistrationFieldValuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The version number of the registration.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     */
    private String sectionPath;
    /**
     * <p>
     * An array of paths to the registration form field.
     * </p>
     */
    private java.util.List<String> fieldPaths;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the registration.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @return The version number of the registration.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @param sectionPath
     *        The path to the section of the registration.
     */

    public void setSectionPath(String sectionPath) {
        this.sectionPath = sectionPath;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @return The path to the section of the registration.
     */

    public String getSectionPath() {
        return this.sectionPath;
    }

    /**
     * <p>
     * The path to the section of the registration.
     * </p>
     * 
     * @param sectionPath
     *        The path to the section of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withSectionPath(String sectionPath) {
        setSectionPath(sectionPath);
        return this;
    }

    /**
     * <p>
     * An array of paths to the registration form field.
     * </p>
     * 
     * @return An array of paths to the registration form field.
     */

    public java.util.List<String> getFieldPaths() {
        return fieldPaths;
    }

    /**
     * <p>
     * An array of paths to the registration form field.
     * </p>
     * 
     * @param fieldPaths
     *        An array of paths to the registration form field.
     */

    public void setFieldPaths(java.util.Collection<String> fieldPaths) {
        if (fieldPaths == null) {
            this.fieldPaths = null;
            return;
        }

        this.fieldPaths = new java.util.ArrayList<String>(fieldPaths);
    }

    /**
     * <p>
     * An array of paths to the registration form field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldPaths(java.util.Collection)} or {@link #withFieldPaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldPaths
     *        An array of paths to the registration form field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withFieldPaths(String... fieldPaths) {
        if (this.fieldPaths == null) {
            setFieldPaths(new java.util.ArrayList<String>(fieldPaths.length));
        }
        for (String ele : fieldPaths) {
            this.fieldPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of paths to the registration form field.
     * </p>
     * 
     * @param fieldPaths
     *        An array of paths to the registration form field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withFieldPaths(java.util.Collection<String> fieldPaths) {
        setFieldPaths(fieldPaths);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. You don't need to supply a value for this
     *         field in the initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @return The maximum number of results to return per each request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getSectionPath() != null)
            sb.append("SectionPath: ").append(getSectionPath()).append(",");
        if (getFieldPaths() != null)
            sb.append("FieldPaths: ").append(getFieldPaths()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegistrationFieldValuesRequest == false)
            return false;
        DescribeRegistrationFieldValuesRequest other = (DescribeRegistrationFieldValuesRequest) obj;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getSectionPath() == null ^ this.getSectionPath() == null)
            return false;
        if (other.getSectionPath() != null && other.getSectionPath().equals(this.getSectionPath()) == false)
            return false;
        if (other.getFieldPaths() == null ^ this.getFieldPaths() == null)
            return false;
        if (other.getFieldPaths() != null && other.getFieldPaths().equals(this.getFieldPaths()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getSectionPath() == null) ? 0 : getSectionPath().hashCode());
        hashCode = prime * hashCode + ((getFieldPaths() == null) ? 0 : getFieldPaths().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegistrationFieldValuesRequest clone() {
        return (DescribeRegistrationFieldValuesRequest) super.clone();
    }

}
