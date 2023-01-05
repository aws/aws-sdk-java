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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     * <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     * <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * 
     * @param resourceArn
     *        Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     *        <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.</p>
     *        <p>
     *        For example,
     *        <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     *        </p>
     *        <p>
     *        Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     *        <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     *        <code>vocabulary-filter</code>, and <code>language-model</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     * <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * 
     * @return Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     *         <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.</p>
     *         <p>
     *         For example,
     *         <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     *         </p>
     *         <p>
     *         Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     *         <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     *         <code>vocabulary-filter</code>, and <code>language-model</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     * <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * 
     * @param resourceArn
     *        Returns a list of all tags associated with the specified Amazon Resource Name (ARN). ARNs have the format
     *        <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.</p>
     *        <p>
     *        For example,
     *        <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>.
     *        </p>
     *        <p>
     *        Valid values for <code>resource-type</code> are: <code>transcription-job</code>,
     *        <code>medical-transcription-job</code>, <code>vocabulary</code>, <code>medical-vocabulary</code>,
     *        <code>vocabulary-filter</code>, and <code>language-model</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
