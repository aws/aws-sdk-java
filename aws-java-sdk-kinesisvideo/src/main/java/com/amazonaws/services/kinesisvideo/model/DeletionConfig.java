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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details required to delete the connection of the stream from the Edge Agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeletionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of the
     * retention time is 720 hours, which translates to 30 days.
     * </p>
     */
    private Integer edgeRetentionInHours;
    /**
     * <p>
     * The value of the local size required in order to delete the edge configuration.
     * </p>
     */
    private LocalSizeConfig localSizeConfig;
    /**
     * <p>
     * The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion, once it
     * has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the deletion
     * configuration values are set to <code>true</code>, such as when the limit for the
     * <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached.
     * </p>
     * <p>
     * Since the default value is set to <code>true</code>, configure the uploader schedule such that the media files
     * are not being deleted before they are initially uploaded to AWS cloud.
     * </p>
     */
    private Boolean deleteAfterUpload;

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of the
     * retention time is 720 hours, which translates to 30 days.
     * </p>
     * 
     * @param edgeRetentionInHours
     *        The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of
     *        the retention time is 720 hours, which translates to 30 days.
     */

    public void setEdgeRetentionInHours(Integer edgeRetentionInHours) {
        this.edgeRetentionInHours = edgeRetentionInHours;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of the
     * retention time is 720 hours, which translates to 30 days.
     * </p>
     * 
     * @return The number of hours that you want to retain the data in the stream on the Edge Agent. The default value
     *         of the retention time is 720 hours, which translates to 30 days.
     */

    public Integer getEdgeRetentionInHours() {
        return this.edgeRetentionInHours;
    }

    /**
     * <p>
     * The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of the
     * retention time is 720 hours, which translates to 30 days.
     * </p>
     * 
     * @param edgeRetentionInHours
     *        The number of hours that you want to retain the data in the stream on the Edge Agent. The default value of
     *        the retention time is 720 hours, which translates to 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionConfig withEdgeRetentionInHours(Integer edgeRetentionInHours) {
        setEdgeRetentionInHours(edgeRetentionInHours);
        return this;
    }

    /**
     * <p>
     * The value of the local size required in order to delete the edge configuration.
     * </p>
     * 
     * @param localSizeConfig
     *        The value of the local size required in order to delete the edge configuration.
     */

    public void setLocalSizeConfig(LocalSizeConfig localSizeConfig) {
        this.localSizeConfig = localSizeConfig;
    }

    /**
     * <p>
     * The value of the local size required in order to delete the edge configuration.
     * </p>
     * 
     * @return The value of the local size required in order to delete the edge configuration.
     */

    public LocalSizeConfig getLocalSizeConfig() {
        return this.localSizeConfig;
    }

    /**
     * <p>
     * The value of the local size required in order to delete the edge configuration.
     * </p>
     * 
     * @param localSizeConfig
     *        The value of the local size required in order to delete the edge configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionConfig withLocalSizeConfig(LocalSizeConfig localSizeConfig) {
        setLocalSizeConfig(localSizeConfig);
        return this;
    }

    /**
     * <p>
     * The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion, once it
     * has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the deletion
     * configuration values are set to <code>true</code>, such as when the limit for the
     * <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached.
     * </p>
     * <p>
     * Since the default value is set to <code>true</code>, configure the uploader schedule such that the media files
     * are not being deleted before they are initially uploaded to AWS cloud.
     * </p>
     * 
     * @param deleteAfterUpload
     *        The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion,
     *        once it has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the
     *        deletion configuration values are set to <code>true</code>, such as when the limit for the
     *        <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached. </p>
     *        <p>
     *        Since the default value is set to <code>true</code>, configure the uploader schedule such that the media
     *        files are not being deleted before they are initially uploaded to AWS cloud.
     */

    public void setDeleteAfterUpload(Boolean deleteAfterUpload) {
        this.deleteAfterUpload = deleteAfterUpload;
    }

    /**
     * <p>
     * The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion, once it
     * has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the deletion
     * configuration values are set to <code>true</code>, such as when the limit for the
     * <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached.
     * </p>
     * <p>
     * Since the default value is set to <code>true</code>, configure the uploader schedule such that the media files
     * are not being deleted before they are initially uploaded to AWS cloud.
     * </p>
     * 
     * @return The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion,
     *         once it has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the
     *         deletion configuration values are set to <code>true</code>, such as when the limit for the
     *         <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached. </p>
     *         <p>
     *         Since the default value is set to <code>true</code>, configure the uploader schedule such that the media
     *         files are not being deleted before they are initially uploaded to AWS cloud.
     */

    public Boolean getDeleteAfterUpload() {
        return this.deleteAfterUpload;
    }

    /**
     * <p>
     * The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion, once it
     * has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the deletion
     * configuration values are set to <code>true</code>, such as when the limit for the
     * <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached.
     * </p>
     * <p>
     * Since the default value is set to <code>true</code>, configure the uploader schedule such that the media files
     * are not being deleted before they are initially uploaded to AWS cloud.
     * </p>
     * 
     * @param deleteAfterUpload
     *        The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion,
     *        once it has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the
     *        deletion configuration values are set to <code>true</code>, such as when the limit for the
     *        <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached. </p>
     *        <p>
     *        Since the default value is set to <code>true</code>, configure the uploader schedule such that the media
     *        files are not being deleted before they are initially uploaded to AWS cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionConfig withDeleteAfterUpload(Boolean deleteAfterUpload) {
        setDeleteAfterUpload(deleteAfterUpload);
        return this;
    }

    /**
     * <p>
     * The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion, once it
     * has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the deletion
     * configuration values are set to <code>true</code>, such as when the limit for the
     * <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached.
     * </p>
     * <p>
     * Since the default value is set to <code>true</code>, configure the uploader schedule such that the media files
     * are not being deleted before they are initially uploaded to AWS cloud.
     * </p>
     * 
     * @return The <code>boolean</code> value used to indicate whether or not you want to mark the media for deletion,
     *         once it has been uploaded to the Kinesis Video Stream cloud. The media files can be deleted if any of the
     *         deletion configuration values are set to <code>true</code>, such as when the limit for the
     *         <code>EdgeRetentionInHours</code>, or the <code>MaxLocalMediaSizeInMB</code>, has been reached. </p>
     *         <p>
     *         Since the default value is set to <code>true</code>, configure the uploader schedule such that the media
     *         files are not being deleted before they are initially uploaded to AWS cloud.
     */

    public Boolean isDeleteAfterUpload() {
        return this.deleteAfterUpload;
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
        if (getEdgeRetentionInHours() != null)
            sb.append("EdgeRetentionInHours: ").append(getEdgeRetentionInHours()).append(",");
        if (getLocalSizeConfig() != null)
            sb.append("LocalSizeConfig: ").append(getLocalSizeConfig()).append(",");
        if (getDeleteAfterUpload() != null)
            sb.append("DeleteAfterUpload: ").append(getDeleteAfterUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletionConfig == false)
            return false;
        DeletionConfig other = (DeletionConfig) obj;
        if (other.getEdgeRetentionInHours() == null ^ this.getEdgeRetentionInHours() == null)
            return false;
        if (other.getEdgeRetentionInHours() != null && other.getEdgeRetentionInHours().equals(this.getEdgeRetentionInHours()) == false)
            return false;
        if (other.getLocalSizeConfig() == null ^ this.getLocalSizeConfig() == null)
            return false;
        if (other.getLocalSizeConfig() != null && other.getLocalSizeConfig().equals(this.getLocalSizeConfig()) == false)
            return false;
        if (other.getDeleteAfterUpload() == null ^ this.getDeleteAfterUpload() == null)
            return false;
        if (other.getDeleteAfterUpload() != null && other.getDeleteAfterUpload().equals(this.getDeleteAfterUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeRetentionInHours() == null) ? 0 : getEdgeRetentionInHours().hashCode());
        hashCode = prime * hashCode + ((getLocalSizeConfig() == null) ? 0 : getLocalSizeConfig().hashCode());
        hashCode = prime * hashCode + ((getDeleteAfterUpload() == null) ? 0 : getDeleteAfterUpload().hashCode());
        return hashCode;
    }

    @Override
    public DeletionConfig clone() {
        try {
            return (DeletionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.DeletionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
