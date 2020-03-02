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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIPSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     */
    private String location;
    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     * </p>
     */
    private Boolean activate;
    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     * </p>
     * 
     * @return The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * </p>
     * 
     * @param name
     *        The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     *        activity that involves IP addresses included in this IPSet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * </p>
     * 
     * @return The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered
     *         by activity that involves IP addresses included in this IPSet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     * activity that involves IP addresses included in this IPSet.
     * </p>
     * 
     * @param name
     *        The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by
     *        activity that involves IP addresses included in this IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * 
     * @param format
     *        The format of the file that contains the IPSet.
     * @see IpSetFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * 
     * @return The format of the file that contains the IPSet.
     * @see IpSetFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * 
     * @param format
     *        The format of the file that contains the IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpSetFormat
     */

    public CreateIPSetRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * 
     * @param format
     *        The format of the file that contains the IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpSetFormat
     */

    public CreateIPSetRequest withFormat(IpSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     * 
     * @param location
     *        The URI of the file that contains the IPSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     * 
     * @return The URI of the file that contains the IPSet. For example
     *         (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * </p>
     * 
     * @param location
     *        The URI of the file that contains the IPSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     * </p>
     * 
     * @param activate
     *        A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     */

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     * </p>
     * 
     * @return A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     */

    public Boolean getActivate() {
        return this.activate;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     * </p>
     * 
     * @param activate
     *        A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest withActivate(Boolean activate) {
        setActivate(activate);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     * </p>
     * 
     * @return A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
     */

    public Boolean isActivate() {
        return this.activate;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @return The idempotency token for the create request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     * 
     * @return The tags to be added to a new IP set resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     * 
     * @param tags
     *        The tags to be added to a new IP set resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     * 
     * @param tags
     *        The tags to be added to a new IP set resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateIPSetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetRequest addTagsEntry(String key, String value) {
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

    public CreateIPSetRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getActivate() != null)
            sb.append("Activate: ").append(getActivate()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateIPSetRequest == false)
            return false;
        CreateIPSetRequest other = (CreateIPSetRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateIPSetRequest clone() {
        return (CreateIPSetRequest) super.clone();
    }

}
