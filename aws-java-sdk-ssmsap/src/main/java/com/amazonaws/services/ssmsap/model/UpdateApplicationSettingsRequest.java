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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String applicationId;
    /** <p/> */
    private java.util.List<ApplicationCredential> credentialsToAddOrUpdate;
    /** <p/> */
    private java.util.List<ApplicationCredential> credentialsToRemove;

    /**
     * <p/>
     * 
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p/>
     * 
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ApplicationCredential> getCredentialsToAddOrUpdate() {
        return credentialsToAddOrUpdate;
    }

    /**
     * <p/>
     * 
     * @param credentialsToAddOrUpdate
     */

    public void setCredentialsToAddOrUpdate(java.util.Collection<ApplicationCredential> credentialsToAddOrUpdate) {
        if (credentialsToAddOrUpdate == null) {
            this.credentialsToAddOrUpdate = null;
            return;
        }

        this.credentialsToAddOrUpdate = new java.util.ArrayList<ApplicationCredential>(credentialsToAddOrUpdate);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentialsToAddOrUpdate(java.util.Collection)} or
     * {@link #withCredentialsToAddOrUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param credentialsToAddOrUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToAddOrUpdate(ApplicationCredential... credentialsToAddOrUpdate) {
        if (this.credentialsToAddOrUpdate == null) {
            setCredentialsToAddOrUpdate(new java.util.ArrayList<ApplicationCredential>(credentialsToAddOrUpdate.length));
        }
        for (ApplicationCredential ele : credentialsToAddOrUpdate) {
            this.credentialsToAddOrUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param credentialsToAddOrUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToAddOrUpdate(java.util.Collection<ApplicationCredential> credentialsToAddOrUpdate) {
        setCredentialsToAddOrUpdate(credentialsToAddOrUpdate);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ApplicationCredential> getCredentialsToRemove() {
        return credentialsToRemove;
    }

    /**
     * <p/>
     * 
     * @param credentialsToRemove
     */

    public void setCredentialsToRemove(java.util.Collection<ApplicationCredential> credentialsToRemove) {
        if (credentialsToRemove == null) {
            this.credentialsToRemove = null;
            return;
        }

        this.credentialsToRemove = new java.util.ArrayList<ApplicationCredential>(credentialsToRemove);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentialsToRemove(java.util.Collection)} or {@link #withCredentialsToRemove(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param credentialsToRemove
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToRemove(ApplicationCredential... credentialsToRemove) {
        if (this.credentialsToRemove == null) {
            setCredentialsToRemove(new java.util.ArrayList<ApplicationCredential>(credentialsToRemove.length));
        }
        for (ApplicationCredential ele : credentialsToRemove) {
            this.credentialsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param credentialsToRemove
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withCredentialsToRemove(java.util.Collection<ApplicationCredential> credentialsToRemove) {
        setCredentialsToRemove(credentialsToRemove);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCredentialsToAddOrUpdate() != null)
            sb.append("CredentialsToAddOrUpdate: ").append(getCredentialsToAddOrUpdate()).append(",");
        if (getCredentialsToRemove() != null)
            sb.append("CredentialsToRemove: ").append(getCredentialsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationSettingsRequest == false)
            return false;
        UpdateApplicationSettingsRequest other = (UpdateApplicationSettingsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCredentialsToAddOrUpdate() == null ^ this.getCredentialsToAddOrUpdate() == null)
            return false;
        if (other.getCredentialsToAddOrUpdate() != null && other.getCredentialsToAddOrUpdate().equals(this.getCredentialsToAddOrUpdate()) == false)
            return false;
        if (other.getCredentialsToRemove() == null ^ this.getCredentialsToRemove() == null)
            return false;
        if (other.getCredentialsToRemove() != null && other.getCredentialsToRemove().equals(this.getCredentialsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCredentialsToAddOrUpdate() == null) ? 0 : getCredentialsToAddOrUpdate().hashCode());
        hashCode = prime * hashCode + ((getCredentialsToRemove() == null) ? 0 : getCredentialsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationSettingsRequest clone() {
        return (UpdateApplicationSettingsRequest) super.clone();
    }

}
