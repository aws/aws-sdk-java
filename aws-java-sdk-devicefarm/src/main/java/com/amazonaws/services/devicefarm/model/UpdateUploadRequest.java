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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateUpload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the uploaded test spec.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The upload's test spec file name. The name should not contain the '/' character. The test spec file name must end
     * with the <code>.yaml</code> or <code>.yml</code> file extension.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The upload's content type (for example, "application/x-yaml").
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     * </p>
     */
    private Boolean editContent;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the uploaded test spec.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the uploaded test spec.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the uploaded test spec.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the uploaded test spec.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the uploaded test spec.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the uploaded test spec.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUploadRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The upload's test spec file name. The name should not contain the '/' character. The test spec file name must end
     * with the <code>.yaml</code> or <code>.yml</code> file extension.
     * </p>
     * 
     * @param name
     *        The upload's test spec file name. The name should not contain the '/' character. The test spec file name
     *        must end with the <code>.yaml</code> or <code>.yml</code> file extension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The upload's test spec file name. The name should not contain the '/' character. The test spec file name must end
     * with the <code>.yaml</code> or <code>.yml</code> file extension.
     * </p>
     * 
     * @return The upload's test spec file name. The name should not contain the '/' character. The test spec file name
     *         must end with the <code>.yaml</code> or <code>.yml</code> file extension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The upload's test spec file name. The name should not contain the '/' character. The test spec file name must end
     * with the <code>.yaml</code> or <code>.yml</code> file extension.
     * </p>
     * 
     * @param name
     *        The upload's test spec file name. The name should not contain the '/' character. The test spec file name
     *        must end with the <code>.yaml</code> or <code>.yml</code> file extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUploadRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The upload's content type (for example, "application/x-yaml").
     * </p>
     * 
     * @param contentType
     *        The upload's content type (for example, "application/x-yaml").
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The upload's content type (for example, "application/x-yaml").
     * </p>
     * 
     * @return The upload's content type (for example, "application/x-yaml").
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The upload's content type (for example, "application/x-yaml").
     * </p>
     * 
     * @param contentType
     *        The upload's content type (for example, "application/x-yaml").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUploadRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     * </p>
     * 
     * @param editContent
     *        Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     */

    public void setEditContent(Boolean editContent) {
        this.editContent = editContent;
    }

    /**
     * <p>
     * Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     * </p>
     * 
     * @return Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     */

    public Boolean getEditContent() {
        return this.editContent;
    }

    /**
     * <p>
     * Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     * </p>
     * 
     * @param editContent
     *        Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUploadRequest withEditContent(Boolean editContent) {
        setEditContent(editContent);
        return this;
    }

    /**
     * <p>
     * Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     * </p>
     * 
     * @return Set to true if the YAML file has changed and needs to be updated; otherwise, set to false.
     */

    public Boolean isEditContent() {
        return this.editContent;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getEditContent() != null)
            sb.append("EditContent: ").append(getEditContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUploadRequest == false)
            return false;
        UpdateUploadRequest other = (UpdateUploadRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getEditContent() == null ^ this.getEditContent() == null)
            return false;
        if (other.getEditContent() != null && other.getEditContent().equals(this.getEditContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getEditContent() == null) ? 0 : getEditContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUploadRequest clone() {
        return (UpdateUploadRequest) super.clone();
    }

}
