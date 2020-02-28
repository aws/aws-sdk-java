/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for create a new deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * Optional file map that contains file name as the key and file content md5 hash as the value. If this argument is
     * provided, the service will generate different upload url per file. Otherwise, the service will only generate a
     * single upload url for the zipped files.
     * </p>
     */
    private java.util.Map<String, String> fileMap;

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     * 
     * @param branchName
     *        Name for the branch, for the Job.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     * 
     * @return Name for the branch, for the Job.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * Name for the branch, for the Job.
     * </p>
     * 
     * @param branchName
     *        Name for the branch, for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * Optional file map that contains file name as the key and file content md5 hash as the value. If this argument is
     * provided, the service will generate different upload url per file. Otherwise, the service will only generate a
     * single upload url for the zipped files.
     * </p>
     * 
     * @return Optional file map that contains file name as the key and file content md5 hash as the value. If this
     *         argument is provided, the service will generate different upload url per file. Otherwise, the service
     *         will only generate a single upload url for the zipped files.
     */

    public java.util.Map<String, String> getFileMap() {
        return fileMap;
    }

    /**
     * <p>
     * Optional file map that contains file name as the key and file content md5 hash as the value. If this argument is
     * provided, the service will generate different upload url per file. Otherwise, the service will only generate a
     * single upload url for the zipped files.
     * </p>
     * 
     * @param fileMap
     *        Optional file map that contains file name as the key and file content md5 hash as the value. If this
     *        argument is provided, the service will generate different upload url per file. Otherwise, the service will
     *        only generate a single upload url for the zipped files.
     */

    public void setFileMap(java.util.Map<String, String> fileMap) {
        this.fileMap = fileMap;
    }

    /**
     * <p>
     * Optional file map that contains file name as the key and file content md5 hash as the value. If this argument is
     * provided, the service will generate different upload url per file. Otherwise, the service will only generate a
     * single upload url for the zipped files.
     * </p>
     * 
     * @param fileMap
     *        Optional file map that contains file name as the key and file content md5 hash as the value. If this
     *        argument is provided, the service will generate different upload url per file. Otherwise, the service will
     *        only generate a single upload url for the zipped files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withFileMap(java.util.Map<String, String> fileMap) {
        setFileMap(fileMap);
        return this;
    }

    /**
     * Add a single FileMap entry
     *
     * @see CreateDeploymentRequest#withFileMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest addFileMapEntry(String key, String value) {
        if (null == this.fileMap) {
            this.fileMap = new java.util.HashMap<String, String>();
        }
        if (this.fileMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fileMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FileMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest clearFileMapEntries() {
        this.fileMap = null;
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getFileMap() != null)
            sb.append("FileMap: ").append(getFileMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getFileMap() == null ^ this.getFileMap() == null)
            return false;
        if (other.getFileMap() != null && other.getFileMap().equals(this.getFileMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getFileMap() == null) ? 0 : getFileMap().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
