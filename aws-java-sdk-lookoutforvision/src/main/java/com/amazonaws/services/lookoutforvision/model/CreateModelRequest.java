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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project in which you want to create a model version.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * A description for the version of the model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateModel</code>. In this case, safely retry your call to <code>CreateModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>CreateModel</code>. An idempotency token is active for 8 hours.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The location where Amazon Lookout for Vision saves the training results.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * If this parameter is not specified, the copied images are encrypted by a key that AWS owns and manages.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the project in which you want to create a model version.
     * </p>
     * 
     * @param projectName
     *        The name of the project in which you want to create a model version.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project in which you want to create a model version.
     * </p>
     * 
     * @return The name of the project in which you want to create a model version.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project in which you want to create a model version.
     * </p>
     * 
     * @param projectName
     *        The name of the project in which you want to create a model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A description for the version of the model.
     * </p>
     * 
     * @param description
     *        A description for the version of the model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the version of the model.
     * </p>
     * 
     * @return A description for the version of the model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the version of the model.
     * </p>
     * 
     * @param description
     *        A description for the version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateModel</code>. In this case, safely retry your call to <code>CreateModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>CreateModel</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>CreateModel</code>. In this case, safely retry your call to
     *        <code>CreateModel</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>CreateModel</code>. An idempotency token is
     *        active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateModel</code>. In this case, safely retry your call to <code>CreateModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>CreateModel</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once.
     *         You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *         getting a response from <code>CreateModel</code>. In this case, safely retry your call to
     *         <code>CreateModel</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *         the other input parameters are not the same as in the first request. Using a different value for
     *         <code>ClientToken</code> is considered a new call to <code>CreateModel</code>. An idempotency token is
     *         active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateModel</code>. In this case, safely retry your call to <code>CreateModel</code> by using
     * the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not the same
     * as in the first request. Using a different value for <code>ClientToken</code> is considered a new call to
     * <code>CreateModel</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>CreateModel</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>CreateModel</code>. In this case, safely retry your call to
     *        <code>CreateModel</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>CreateModel</code>. An idempotency token is
     *        active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The location where Amazon Lookout for Vision saves the training results.
     * </p>
     * 
     * @param outputConfig
     *        The location where Amazon Lookout for Vision saves the training results.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location where Amazon Lookout for Vision saves the training results.
     * </p>
     * 
     * @return The location where Amazon Lookout for Vision saves the training results.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The location where Amazon Lookout for Vision saves the training results.
     * </p>
     * 
     * @param outputConfig
     *        The location where Amazon Lookout for Vision saves the training results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * If this parameter is not specified, the copied images are encrypted by a key that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used to
     *        encrypt training and test images copied into the service for model training. Your source images are
     *        unaffected. If this parameter is not specified, the copied images are encrypted by a key that AWS owns and
     *        manages.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * If this parameter is not specified, the copied images are encrypted by a key that AWS owns and manages.
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used
     *         to encrypt training and test images copied into the service for model training. Your source images are
     *         unaffected. If this parameter is not specified, the copied images are encrypted by a key that AWS owns
     *         and manages.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * If this parameter is not specified, the copied images are encrypted by a key that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service (AWS KMS) customer master key (CMK). The key is used to
     *        encrypt training and test images copied into the service for model training. Your source images are
     *        unaffected. If this parameter is not specified, the copied images are encrypted by a key that AWS owns and
     *        manages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the model.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelRequest clone() {
        return (CreateModelRequest) super.clone();
    }

}
