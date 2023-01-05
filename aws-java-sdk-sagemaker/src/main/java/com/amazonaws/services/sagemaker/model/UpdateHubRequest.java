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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateHub" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHubRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hub to update.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * A description of the updated hub.
     * </p>
     */
    private String hubDescription;
    /**
     * <p>
     * The display name of the hub.
     * </p>
     */
    private String hubDisplayName;
    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     */
    private java.util.List<String> hubSearchKeywords;

    /**
     * <p>
     * The name of the hub to update.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to update.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub to update.
     * </p>
     * 
     * @return The name of the hub to update.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub to update.
     * </p>
     * 
     * @param hubName
     *        The name of the hub to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHubRequest withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * A description of the updated hub.
     * </p>
     * 
     * @param hubDescription
     *        A description of the updated hub.
     */

    public void setHubDescription(String hubDescription) {
        this.hubDescription = hubDescription;
    }

    /**
     * <p>
     * A description of the updated hub.
     * </p>
     * 
     * @return A description of the updated hub.
     */

    public String getHubDescription() {
        return this.hubDescription;
    }

    /**
     * <p>
     * A description of the updated hub.
     * </p>
     * 
     * @param hubDescription
     *        A description of the updated hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHubRequest withHubDescription(String hubDescription) {
        setHubDescription(hubDescription);
        return this;
    }

    /**
     * <p>
     * The display name of the hub.
     * </p>
     * 
     * @param hubDisplayName
     *        The display name of the hub.
     */

    public void setHubDisplayName(String hubDisplayName) {
        this.hubDisplayName = hubDisplayName;
    }

    /**
     * <p>
     * The display name of the hub.
     * </p>
     * 
     * @return The display name of the hub.
     */

    public String getHubDisplayName() {
        return this.hubDisplayName;
    }

    /**
     * <p>
     * The display name of the hub.
     * </p>
     * 
     * @param hubDisplayName
     *        The display name of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHubRequest withHubDisplayName(String hubDisplayName) {
        setHubDisplayName(hubDisplayName);
        return this;
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * 
     * @return The searchable keywords for the hub.
     */

    public java.util.List<String> getHubSearchKeywords() {
        return hubSearchKeywords;
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * 
     * @param hubSearchKeywords
     *        The searchable keywords for the hub.
     */

    public void setHubSearchKeywords(java.util.Collection<String> hubSearchKeywords) {
        if (hubSearchKeywords == null) {
            this.hubSearchKeywords = null;
            return;
        }

        this.hubSearchKeywords = new java.util.ArrayList<String>(hubSearchKeywords);
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubSearchKeywords(java.util.Collection)} or {@link #withHubSearchKeywords(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param hubSearchKeywords
     *        The searchable keywords for the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHubRequest withHubSearchKeywords(String... hubSearchKeywords) {
        if (this.hubSearchKeywords == null) {
            setHubSearchKeywords(new java.util.ArrayList<String>(hubSearchKeywords.length));
        }
        for (String ele : hubSearchKeywords) {
            this.hubSearchKeywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * 
     * @param hubSearchKeywords
     *        The searchable keywords for the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHubRequest withHubSearchKeywords(java.util.Collection<String> hubSearchKeywords) {
        setHubSearchKeywords(hubSearchKeywords);
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
        if (getHubName() != null)
            sb.append("HubName: ").append(getHubName()).append(",");
        if (getHubDescription() != null)
            sb.append("HubDescription: ").append(getHubDescription()).append(",");
        if (getHubDisplayName() != null)
            sb.append("HubDisplayName: ").append(getHubDisplayName()).append(",");
        if (getHubSearchKeywords() != null)
            sb.append("HubSearchKeywords: ").append(getHubSearchKeywords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHubRequest == false)
            return false;
        UpdateHubRequest other = (UpdateHubRequest) obj;
        if (other.getHubName() == null ^ this.getHubName() == null)
            return false;
        if (other.getHubName() != null && other.getHubName().equals(this.getHubName()) == false)
            return false;
        if (other.getHubDescription() == null ^ this.getHubDescription() == null)
            return false;
        if (other.getHubDescription() != null && other.getHubDescription().equals(this.getHubDescription()) == false)
            return false;
        if (other.getHubDisplayName() == null ^ this.getHubDisplayName() == null)
            return false;
        if (other.getHubDisplayName() != null && other.getHubDisplayName().equals(this.getHubDisplayName()) == false)
            return false;
        if (other.getHubSearchKeywords() == null ^ this.getHubSearchKeywords() == null)
            return false;
        if (other.getHubSearchKeywords() != null && other.getHubSearchKeywords().equals(this.getHubSearchKeywords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubName() == null) ? 0 : getHubName().hashCode());
        hashCode = prime * hashCode + ((getHubDescription() == null) ? 0 : getHubDescription().hashCode());
        hashCode = prime * hashCode + ((getHubDisplayName() == null) ? 0 : getHubDisplayName().hashCode());
        hashCode = prime * hashCode + ((getHubSearchKeywords() == null) ? 0 : getHubSearchKeywords().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHubRequest clone() {
        return (UpdateHubRequest) super.clone();
    }

}
