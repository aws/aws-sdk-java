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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDeviceInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * An array of strings that you want to associate with the device instance.
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the device instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceInstanceRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     * </p>
     * 
     * @param profileArn
     *        The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     * </p>
     * 
     * @param profileArn
     *        The Amazon Resource Name (ARN) of the profile that you want to associate with the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceInstanceRequest withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * <p>
     * An array of strings that you want to associate with the device instance.
     * </p>
     * 
     * @return An array of strings that you want to associate with the device instance.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of strings that you want to associate with the device instance.
     * </p>
     * 
     * @param labels
     *        An array of strings that you want to associate with the device instance.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * An array of strings that you want to associate with the device instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        An array of strings that you want to associate with the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceInstanceRequest withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that you want to associate with the device instance.
     * </p>
     * 
     * @param labels
     *        An array of strings that you want to associate with the device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceInstanceRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceInstanceRequest == false)
            return false;
        UpdateDeviceInstanceRequest other = (UpdateDeviceInstanceRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceInstanceRequest clone() {
        return (UpdateDeviceInstanceRequest) super.clone();
    }

}
