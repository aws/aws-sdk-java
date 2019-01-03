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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdatePlacement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePlacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the placement to update.
     * </p>
     */
    private String placementName;
    /**
     * <p>
     * The name of the project containing the placement to be updated.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The name of the placement to update.
     * </p>
     * 
     * @param placementName
     *        The name of the placement to update.
     */

    public void setPlacementName(String placementName) {
        this.placementName = placementName;
    }

    /**
     * <p>
     * The name of the placement to update.
     * </p>
     * 
     * @return The name of the placement to update.
     */

    public String getPlacementName() {
        return this.placementName;
    }

    /**
     * <p>
     * The name of the placement to update.
     * </p>
     * 
     * @param placementName
     *        The name of the placement to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlacementRequest withPlacementName(String placementName) {
        setPlacementName(placementName);
        return this;
    }

    /**
     * <p>
     * The name of the project containing the placement to be updated.
     * </p>
     * 
     * @param projectName
     *        The name of the project containing the placement to be updated.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project containing the placement to be updated.
     * </p>
     * 
     * @return The name of the project containing the placement to be updated.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project containing the placement to be updated.
     * </p>
     * 
     * @param projectName
     *        The name of the project containing the placement to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlacementRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
     * </p>
     * 
     * @return The user-defined object of attributes used to update the placement. The maximum number of key/value pairs
     *         is 50.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
     * </p>
     * 
     * @param attributes
     *        The user-defined object of attributes used to update the placement. The maximum number of key/value pairs
     *        is 50.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
     * </p>
     * 
     * @param attributes
     *        The user-defined object of attributes used to update the placement. The maximum number of key/value pairs
     *        is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlacementRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public UpdatePlacementRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlacementRequest clearAttributesEntries() {
        this.attributes = null;
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
        if (getPlacementName() != null)
            sb.append("PlacementName: ").append(getPlacementName()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePlacementRequest == false)
            return false;
        UpdatePlacementRequest other = (UpdatePlacementRequest) obj;
        if (other.getPlacementName() == null ^ this.getPlacementName() == null)
            return false;
        if (other.getPlacementName() != null && other.getPlacementName().equals(this.getPlacementName()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacementName() == null) ? 0 : getPlacementName().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePlacementRequest clone() {
        return (UpdatePlacementRequest) super.clone();
    }

}
