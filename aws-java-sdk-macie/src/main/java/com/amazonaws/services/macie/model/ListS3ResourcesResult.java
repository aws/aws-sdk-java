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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListS3Resources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListS3ResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     */
    private java.util.List<S3ResourceClassification> s3Resources;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     * 
     * @return A list of the associated S3 resources returned by the action.
     */

    public java.util.List<S3ResourceClassification> getS3Resources() {
        return s3Resources;
    }

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     * 
     * @param s3Resources
     *        A list of the associated S3 resources returned by the action.
     */

    public void setS3Resources(java.util.Collection<S3ResourceClassification> s3Resources) {
        if (s3Resources == null) {
            this.s3Resources = null;
            return;
        }

        this.s3Resources = new java.util.ArrayList<S3ResourceClassification>(s3Resources);
    }

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Resources(java.util.Collection)} or {@link #withS3Resources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3Resources
     *        A list of the associated S3 resources returned by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3ResourcesResult withS3Resources(S3ResourceClassification... s3Resources) {
        if (this.s3Resources == null) {
            setS3Resources(new java.util.ArrayList<S3ResourceClassification>(s3Resources.length));
        }
        for (S3ResourceClassification ele : s3Resources) {
            this.s3Resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     * 
     * @param s3Resources
     *        A list of the associated S3 resources returned by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3ResourcesResult withS3Resources(java.util.Collection<S3ResourceClassification> s3Resources) {
        setS3Resources(s3Resources);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the nextToken parameter in a subsequent pagination request. If
     *        there is no more data to be listed, this parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed, this parameter is present in the
     *         response and contains the value to use for the nextToken parameter in a subsequent pagination request. If
     *         there is no more data to be listed, this parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more
     * data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the nextToken parameter in a subsequent pagination request. If
     *        there is no more data to be listed, this parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3ResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getS3Resources() != null)
            sb.append("S3Resources: ").append(getS3Resources()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListS3ResourcesResult == false)
            return false;
        ListS3ResourcesResult other = (ListS3ResourcesResult) obj;
        if (other.getS3Resources() == null ^ this.getS3Resources() == null)
            return false;
        if (other.getS3Resources() != null && other.getS3Resources().equals(this.getS3Resources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListS3ResourcesResult clone() {
        try {
            return (ListS3ResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
