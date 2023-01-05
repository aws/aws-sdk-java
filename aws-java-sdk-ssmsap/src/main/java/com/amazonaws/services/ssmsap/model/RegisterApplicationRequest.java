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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/RegisterApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String applicationId;
    /** <p/> */
    private String applicationType;
    /** <p/> */
    private java.util.List<String> instances;
    /** <p/> */
    private String sapInstanceNumber;
    /** <p/> */
    private String sid;
    /** <p/> */
    private java.util.Map<String, String> tags;
    /** <p/> */
    private java.util.List<ApplicationCredential> credentials;

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

    public RegisterApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param applicationType
     * @see ApplicationType
     */

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ApplicationType
     */

    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * <p/>
     * 
     * @param applicationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public RegisterApplicationRequest withApplicationType(String applicationType) {
        setApplicationType(applicationType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param applicationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public RegisterApplicationRequest withApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getInstances() {
        return instances;
    }

    /**
     * <p/>
     * 
     * @param instances
     */

    public void setInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<String>(instances);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withInstances(String... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<String>(instances.length));
        }
        for (String ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param instances
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withInstances(java.util.Collection<String> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sapInstanceNumber
     */

    public void setSapInstanceNumber(String sapInstanceNumber) {
        this.sapInstanceNumber = sapInstanceNumber;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSapInstanceNumber() {
        return this.sapInstanceNumber;
    }

    /**
     * <p/>
     * 
     * @param sapInstanceNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withSapInstanceNumber(String sapInstanceNumber) {
        setSapInstanceNumber(sapInstanceNumber);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sid
     */

    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSid() {
        return this.sid;
    }

    /**
     * <p/>
     * 
     * @param sid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withSid(String sid) {
        setSid(sid);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p/>
     * 
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p/>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RegisterApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ApplicationCredential> getCredentials() {
        return credentials;
    }

    /**
     * <p/>
     * 
     * @param credentials
     */

    public void setCredentials(java.util.Collection<ApplicationCredential> credentials) {
        if (credentials == null) {
            this.credentials = null;
            return;
        }

        this.credentials = new java.util.ArrayList<ApplicationCredential>(credentials);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentials(java.util.Collection)} or {@link #withCredentials(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param credentials
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withCredentials(ApplicationCredential... credentials) {
        if (this.credentials == null) {
            setCredentials(new java.util.ArrayList<ApplicationCredential>(credentials.length));
        }
        for (ApplicationCredential ele : credentials) {
            this.credentials.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param credentials
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRequest withCredentials(java.util.Collection<ApplicationCredential> credentials) {
        setCredentials(credentials);
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
        if (getApplicationType() != null)
            sb.append("ApplicationType: ").append(getApplicationType()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getSapInstanceNumber() != null)
            sb.append("SapInstanceNumber: ").append(getSapInstanceNumber()).append(",");
        if (getSid() != null)
            sb.append("Sid: ").append(getSid()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterApplicationRequest == false)
            return false;
        RegisterApplicationRequest other = (RegisterApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationType() == null ^ this.getApplicationType() == null)
            return false;
        if (other.getApplicationType() != null && other.getApplicationType().equals(this.getApplicationType()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getSapInstanceNumber() == null ^ this.getSapInstanceNumber() == null)
            return false;
        if (other.getSapInstanceNumber() != null && other.getSapInstanceNumber().equals(this.getSapInstanceNumber()) == false)
            return false;
        if (other.getSid() == null ^ this.getSid() == null)
            return false;
        if (other.getSid() != null && other.getSid().equals(this.getSid()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationType() == null) ? 0 : getApplicationType().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getSapInstanceNumber() == null) ? 0 : getSapInstanceNumber().hashCode());
        hashCode = prime * hashCode + ((getSid() == null) ? 0 : getSid().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public RegisterApplicationRequest clone() {
        return (RegisterApplicationRequest) super.clone();
    }

}
