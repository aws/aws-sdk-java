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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RestoreManagedPrefixListVersionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreManagedPrefixListVersionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RestoreManagedPrefixListVersionRequest> {

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The version to restore.
     * </p>
     */
    private Long previousVersion;
    /**
     * <p>
     * The current version number for the prefix list.
     * </p>
     */
    private Long currentVersion;

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreManagedPrefixListVersionRequest withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The version to restore.
     * </p>
     * 
     * @param previousVersion
     *        The version to restore.
     */

    public void setPreviousVersion(Long previousVersion) {
        this.previousVersion = previousVersion;
    }

    /**
     * <p>
     * The version to restore.
     * </p>
     * 
     * @return The version to restore.
     */

    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    /**
     * <p>
     * The version to restore.
     * </p>
     * 
     * @param previousVersion
     *        The version to restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreManagedPrefixListVersionRequest withPreviousVersion(Long previousVersion) {
        setPreviousVersion(previousVersion);
        return this;
    }

    /**
     * <p>
     * The current version number for the prefix list.
     * </p>
     * 
     * @param currentVersion
     *        The current version number for the prefix list.
     */

    public void setCurrentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version number for the prefix list.
     * </p>
     * 
     * @return The current version number for the prefix list.
     */

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version number for the prefix list.
     * </p>
     * 
     * @param currentVersion
     *        The current version number for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreManagedPrefixListVersionRequest withCurrentVersion(Long currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RestoreManagedPrefixListVersionRequest> getDryRunRequest() {
        Request<RestoreManagedPrefixListVersionRequest> request = new RestoreManagedPrefixListVersionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getPreviousVersion() != null)
            sb.append("PreviousVersion: ").append(getPreviousVersion()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreManagedPrefixListVersionRequest == false)
            return false;
        RestoreManagedPrefixListVersionRequest other = (RestoreManagedPrefixListVersionRequest) obj;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getPreviousVersion() == null ^ this.getPreviousVersion() == null)
            return false;
        if (other.getPreviousVersion() != null && other.getPreviousVersion().equals(this.getPreviousVersion()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getPreviousVersion() == null) ? 0 : getPreviousVersion().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public RestoreManagedPrefixListVersionRequest clone() {
        return (RestoreManagedPrefixListVersionRequest) super.clone();
    }
}
