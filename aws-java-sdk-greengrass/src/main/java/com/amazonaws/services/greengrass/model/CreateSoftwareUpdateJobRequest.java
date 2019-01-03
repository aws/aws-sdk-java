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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSoftwareUpdateJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSoftwareUpdateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;

    private String s3UrlSignerRole;

    private String softwareToUpdate;

    private String updateAgentLogLevel;

    private java.util.List<String> updateTargets;

    private String updateTargetsArchitecture;

    private String updateTargetsOperatingSystem;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSoftwareUpdateJobRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * @param s3UrlSignerRole
     */

    public void setS3UrlSignerRole(String s3UrlSignerRole) {
        this.s3UrlSignerRole = s3UrlSignerRole;
    }

    /**
     * @return
     */

    public String getS3UrlSignerRole() {
        return this.s3UrlSignerRole;
    }

    /**
     * @param s3UrlSignerRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSoftwareUpdateJobRequest withS3UrlSignerRole(String s3UrlSignerRole) {
        setS3UrlSignerRole(s3UrlSignerRole);
        return this;
    }

    /**
     * @param softwareToUpdate
     * @see SoftwareToUpdate
     */

    public void setSoftwareToUpdate(String softwareToUpdate) {
        this.softwareToUpdate = softwareToUpdate;
    }

    /**
     * @return
     * @see SoftwareToUpdate
     */

    public String getSoftwareToUpdate() {
        return this.softwareToUpdate;
    }

    /**
     * @param softwareToUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareToUpdate
     */

    public CreateSoftwareUpdateJobRequest withSoftwareToUpdate(String softwareToUpdate) {
        setSoftwareToUpdate(softwareToUpdate);
        return this;
    }

    /**
     * @param softwareToUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareToUpdate
     */

    public CreateSoftwareUpdateJobRequest withSoftwareToUpdate(SoftwareToUpdate softwareToUpdate) {
        this.softwareToUpdate = softwareToUpdate.toString();
        return this;
    }

    /**
     * @param updateAgentLogLevel
     * @see UpdateAgentLogLevel
     */

    public void setUpdateAgentLogLevel(String updateAgentLogLevel) {
        this.updateAgentLogLevel = updateAgentLogLevel;
    }

    /**
     * @return
     * @see UpdateAgentLogLevel
     */

    public String getUpdateAgentLogLevel() {
        return this.updateAgentLogLevel;
    }

    /**
     * @param updateAgentLogLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateAgentLogLevel
     */

    public CreateSoftwareUpdateJobRequest withUpdateAgentLogLevel(String updateAgentLogLevel) {
        setUpdateAgentLogLevel(updateAgentLogLevel);
        return this;
    }

    /**
     * @param updateAgentLogLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateAgentLogLevel
     */

    public CreateSoftwareUpdateJobRequest withUpdateAgentLogLevel(UpdateAgentLogLevel updateAgentLogLevel) {
        this.updateAgentLogLevel = updateAgentLogLevel.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getUpdateTargets() {
        return updateTargets;
    }

    /**
     * @param updateTargets
     */

    public void setUpdateTargets(java.util.Collection<String> updateTargets) {
        if (updateTargets == null) {
            this.updateTargets = null;
            return;
        }

        this.updateTargets = new java.util.ArrayList<String>(updateTargets);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateTargets(java.util.Collection)} or {@link #withUpdateTargets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param updateTargets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSoftwareUpdateJobRequest withUpdateTargets(String... updateTargets) {
        if (this.updateTargets == null) {
            setUpdateTargets(new java.util.ArrayList<String>(updateTargets.length));
        }
        for (String ele : updateTargets) {
            this.updateTargets.add(ele);
        }
        return this;
    }

    /**
     * @param updateTargets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSoftwareUpdateJobRequest withUpdateTargets(java.util.Collection<String> updateTargets) {
        setUpdateTargets(updateTargets);
        return this;
    }

    /**
     * @param updateTargetsArchitecture
     * @see UpdateTargetsArchitecture
     */

    public void setUpdateTargetsArchitecture(String updateTargetsArchitecture) {
        this.updateTargetsArchitecture = updateTargetsArchitecture;
    }

    /**
     * @return
     * @see UpdateTargetsArchitecture
     */

    public String getUpdateTargetsArchitecture() {
        return this.updateTargetsArchitecture;
    }

    /**
     * @param updateTargetsArchitecture
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateTargetsArchitecture
     */

    public CreateSoftwareUpdateJobRequest withUpdateTargetsArchitecture(String updateTargetsArchitecture) {
        setUpdateTargetsArchitecture(updateTargetsArchitecture);
        return this;
    }

    /**
     * @param updateTargetsArchitecture
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateTargetsArchitecture
     */

    public CreateSoftwareUpdateJobRequest withUpdateTargetsArchitecture(UpdateTargetsArchitecture updateTargetsArchitecture) {
        this.updateTargetsArchitecture = updateTargetsArchitecture.toString();
        return this;
    }

    /**
     * @param updateTargetsOperatingSystem
     * @see UpdateTargetsOperatingSystem
     */

    public void setUpdateTargetsOperatingSystem(String updateTargetsOperatingSystem) {
        this.updateTargetsOperatingSystem = updateTargetsOperatingSystem;
    }

    /**
     * @return
     * @see UpdateTargetsOperatingSystem
     */

    public String getUpdateTargetsOperatingSystem() {
        return this.updateTargetsOperatingSystem;
    }

    /**
     * @param updateTargetsOperatingSystem
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateTargetsOperatingSystem
     */

    public CreateSoftwareUpdateJobRequest withUpdateTargetsOperatingSystem(String updateTargetsOperatingSystem) {
        setUpdateTargetsOperatingSystem(updateTargetsOperatingSystem);
        return this;
    }

    /**
     * @param updateTargetsOperatingSystem
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateTargetsOperatingSystem
     */

    public CreateSoftwareUpdateJobRequest withUpdateTargetsOperatingSystem(UpdateTargetsOperatingSystem updateTargetsOperatingSystem) {
        this.updateTargetsOperatingSystem = updateTargetsOperatingSystem.toString();
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getS3UrlSignerRole() != null)
            sb.append("S3UrlSignerRole: ").append(getS3UrlSignerRole()).append(",");
        if (getSoftwareToUpdate() != null)
            sb.append("SoftwareToUpdate: ").append(getSoftwareToUpdate()).append(",");
        if (getUpdateAgentLogLevel() != null)
            sb.append("UpdateAgentLogLevel: ").append(getUpdateAgentLogLevel()).append(",");
        if (getUpdateTargets() != null)
            sb.append("UpdateTargets: ").append(getUpdateTargets()).append(",");
        if (getUpdateTargetsArchitecture() != null)
            sb.append("UpdateTargetsArchitecture: ").append(getUpdateTargetsArchitecture()).append(",");
        if (getUpdateTargetsOperatingSystem() != null)
            sb.append("UpdateTargetsOperatingSystem: ").append(getUpdateTargetsOperatingSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSoftwareUpdateJobRequest == false)
            return false;
        CreateSoftwareUpdateJobRequest other = (CreateSoftwareUpdateJobRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getS3UrlSignerRole() == null ^ this.getS3UrlSignerRole() == null)
            return false;
        if (other.getS3UrlSignerRole() != null && other.getS3UrlSignerRole().equals(this.getS3UrlSignerRole()) == false)
            return false;
        if (other.getSoftwareToUpdate() == null ^ this.getSoftwareToUpdate() == null)
            return false;
        if (other.getSoftwareToUpdate() != null && other.getSoftwareToUpdate().equals(this.getSoftwareToUpdate()) == false)
            return false;
        if (other.getUpdateAgentLogLevel() == null ^ this.getUpdateAgentLogLevel() == null)
            return false;
        if (other.getUpdateAgentLogLevel() != null && other.getUpdateAgentLogLevel().equals(this.getUpdateAgentLogLevel()) == false)
            return false;
        if (other.getUpdateTargets() == null ^ this.getUpdateTargets() == null)
            return false;
        if (other.getUpdateTargets() != null && other.getUpdateTargets().equals(this.getUpdateTargets()) == false)
            return false;
        if (other.getUpdateTargetsArchitecture() == null ^ this.getUpdateTargetsArchitecture() == null)
            return false;
        if (other.getUpdateTargetsArchitecture() != null && other.getUpdateTargetsArchitecture().equals(this.getUpdateTargetsArchitecture()) == false)
            return false;
        if (other.getUpdateTargetsOperatingSystem() == null ^ this.getUpdateTargetsOperatingSystem() == null)
            return false;
        if (other.getUpdateTargetsOperatingSystem() != null && other.getUpdateTargetsOperatingSystem().equals(this.getUpdateTargetsOperatingSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getS3UrlSignerRole() == null) ? 0 : getS3UrlSignerRole().hashCode());
        hashCode = prime * hashCode + ((getSoftwareToUpdate() == null) ? 0 : getSoftwareToUpdate().hashCode());
        hashCode = prime * hashCode + ((getUpdateAgentLogLevel() == null) ? 0 : getUpdateAgentLogLevel().hashCode());
        hashCode = prime * hashCode + ((getUpdateTargets() == null) ? 0 : getUpdateTargets().hashCode());
        hashCode = prime * hashCode + ((getUpdateTargetsArchitecture() == null) ? 0 : getUpdateTargetsArchitecture().hashCode());
        hashCode = prime * hashCode + ((getUpdateTargetsOperatingSystem() == null) ? 0 : getUpdateTargetsOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public CreateSoftwareUpdateJobRequest clone() {
        return (CreateSoftwareUpdateJobRequest) super.clone();
    }

}
