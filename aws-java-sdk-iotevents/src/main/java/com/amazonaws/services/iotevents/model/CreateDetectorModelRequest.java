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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateDetectorModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDetectorModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the detector model.
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     */
    private DetectorModelDefinition detectorModelDefinition;
    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     */
    private String detectorModelDescription;
    /**
     * <p>
     * The input attribute key used to identify a device or system in order to create a detector (an instance of the
     * detector model) and then to route each input received to the appropriate detector (instance). This parameter uses
     * a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to
     * identify the device associated with the input.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Metadata that can be used to manage the detector model.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model.
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @return The name of the detector model.
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     * 
     * @param detectorModelDefinition
     *        Information that defines how the detectors operate.
     */

    public void setDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     * 
     * @return Information that defines how the detectors operate.
     */

    public DetectorModelDefinition getDetectorModelDefinition() {
        return this.detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how the detectors operate.
     * </p>
     * 
     * @param detectorModelDefinition
     *        Information that defines how the detectors operate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        setDetectorModelDefinition(detectorModelDefinition);
        return this;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @param detectorModelDescription
     *        A brief description of the detector model.
     */

    public void setDetectorModelDescription(String detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @return A brief description of the detector model.
     */

    public String getDetectorModelDescription() {
        return this.detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @param detectorModelDescription
     *        A brief description of the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withDetectorModelDescription(String detectorModelDescription) {
        setDetectorModelDescription(detectorModelDescription);
        return this;
    }

    /**
     * <p>
     * The input attribute key used to identify a device or system in order to create a detector (an instance of the
     * detector model) and then to route each input received to the appropriate detector (instance). This parameter uses
     * a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to
     * identify the device associated with the input.
     * </p>
     * 
     * @param key
     *        The input attribute key used to identify a device or system in order to create a detector (an instance of
     *        the detector model) and then to route each input received to the appropriate detector (instance). This
     *        parameter uses a JSON-path expression to specify the attribute-value pair in the message payload of each
     *        input that is used to identify the device associated with the input.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The input attribute key used to identify a device or system in order to create a detector (an instance of the
     * detector model) and then to route each input received to the appropriate detector (instance). This parameter uses
     * a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to
     * identify the device associated with the input.
     * </p>
     * 
     * @return The input attribute key used to identify a device or system in order to create a detector (an instance of
     *         the detector model) and then to route each input received to the appropriate detector (instance). This
     *         parameter uses a JSON-path expression to specify the attribute-value pair in the message payload of each
     *         input that is used to identify the device associated with the input.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The input attribute key used to identify a device or system in order to create a detector (an instance of the
     * detector model) and then to route each input received to the appropriate detector (instance). This parameter uses
     * a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to
     * identify the device associated with the input.
     * </p>
     * 
     * @param key
     *        The input attribute key used to identify a device or system in order to create a detector (an instance of
     *        the detector model) and then to route each input received to the appropriate detector (instance). This
     *        parameter uses a JSON-path expression to specify the attribute-value pair in the message payload of each
     *        input that is used to identify the device associated with the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     * 
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the detector model.
     * </p>
     * 
     * @return Metadata that can be used to manage the detector model.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the detector model.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the detector model.
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
     * Metadata that can be used to manage the detector model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withTags(Tag... tags) {
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
     * Metadata that can be used to manage the detector model.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorModelRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName()).append(",");
        if (getDetectorModelDefinition() != null)
            sb.append("DetectorModelDefinition: ").append(getDetectorModelDefinition()).append(",");
        if (getDetectorModelDescription() != null)
            sb.append("DetectorModelDescription: ").append(getDetectorModelDescription()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof CreateDetectorModelRequest == false)
            return false;
        CreateDetectorModelRequest other = (CreateDetectorModelRequest) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelDefinition() == null ^ this.getDetectorModelDefinition() == null)
            return false;
        if (other.getDetectorModelDefinition() != null && other.getDetectorModelDefinition().equals(this.getDetectorModelDefinition()) == false)
            return false;
        if (other.getDetectorModelDescription() == null ^ this.getDetectorModelDescription() == null)
            return false;
        if (other.getDetectorModelDescription() != null && other.getDetectorModelDescription().equals(this.getDetectorModelDescription()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelDefinition() == null) ? 0 : getDetectorModelDefinition().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelDescription() == null) ? 0 : getDetectorModelDescription().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDetectorModelRequest clone() {
        return (CreateDetectorModelRequest) super.clone();
    }

}
