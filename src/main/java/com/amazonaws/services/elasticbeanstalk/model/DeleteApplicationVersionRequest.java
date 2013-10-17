/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteApplicationVersion(DeleteApplicationVersionRequest) DeleteApplicationVersion operation}.
 * <p>
 * Deletes the specified version from the specified application.
 * </p>
 * <p>
 * <b>NOTE:</b>You cannot delete an application version that is associated with a running environment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteApplicationVersion(DeleteApplicationVersionRequest)
 */
public class DeleteApplicationVersionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application to delete releases from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The label of the version to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     */
    private Boolean deleteSourceBundle;

    /**
     * Default constructor for a new DeleteApplicationVersionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteApplicationVersionRequest() {}
    
    /**
     * Constructs a new DeleteApplicationVersionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application to delete releases
     * from.
     * @param versionLabel The label of the version to delete.
     */
    public DeleteApplicationVersionRequest(String applicationName, String versionLabel) {
        setApplicationName(applicationName);
        setVersionLabel(versionLabel);
    }

    /**
     * The name of the application to delete releases from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application to delete releases from.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application to delete releases from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete releases from.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to delete releases from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete releases from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The label of the version to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The label of the version to delete.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * The label of the version to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The label of the version to delete.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * The label of the version to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The label of the version to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean isDeleteSourceBundle() {
        return deleteSourceBundle;
    }
    
    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @param deleteSourceBundle Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public void setDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
    }
    
    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteSourceBundle Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteApplicationVersionRequest withDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
        return this;
    }

    /**
     * Indicates whether to delete the associated source bundle from Amazon
     * S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     * associated Amazon S3 source bundle specified at time of creation.
     * </li> <li> <code>false</code>: No action is taken on the Amazon S3
     * source bundle specified at time of creation. </li> </ul> <p> Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return Indicates whether to delete the associated source bundle from Amazon
     *         S3: <ul> <li> <code>true</code>: An attempt is made to delete the
     *         associated Amazon S3 source bundle specified at time of creation.
     *         </li> <li> <code>false</code>: No action is taken on the Amazon S3
     *         source bundle specified at time of creation. </li> </ul> <p> Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean getDeleteSourceBundle() {
        return deleteSourceBundle;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null) sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (isDeleteSourceBundle() != null) sb.append("DeleteSourceBundle: " + isDeleteSourceBundle() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteSourceBundle() == null) ? 0 : isDeleteSourceBundle().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteApplicationVersionRequest == false) return false;
        DeleteApplicationVersionRequest other = (DeleteApplicationVersionRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null) return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false) return false; 
        if (other.isDeleteSourceBundle() == null ^ this.isDeleteSourceBundle() == null) return false;
        if (other.isDeleteSourceBundle() != null && other.isDeleteSourceBundle().equals(this.isDeleteSourceBundle()) == false) return false; 
        return true;
    }
    
}
    