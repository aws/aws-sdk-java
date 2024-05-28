/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartDirectoryListing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDirectoryListingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * Specifies the directory on the remote SFTP server for which you want to list its contents.
     * </p>
     */
    private String remoteDirectoryPath;
    /**
     * <p>
     * An optional parameter where you can specify the maximum number of file/directory names to retrieve. The default
     * value is 1,000.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory listing.
     * </p>
     */
    private String outputDirectoryPath;

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @return The unique identifier for the connector.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDirectoryListingRequest withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * Specifies the directory on the remote SFTP server for which you want to list its contents.
     * </p>
     * 
     * @param remoteDirectoryPath
     *        Specifies the directory on the remote SFTP server for which you want to list its contents.
     */

    public void setRemoteDirectoryPath(String remoteDirectoryPath) {
        this.remoteDirectoryPath = remoteDirectoryPath;
    }

    /**
     * <p>
     * Specifies the directory on the remote SFTP server for which you want to list its contents.
     * </p>
     * 
     * @return Specifies the directory on the remote SFTP server for which you want to list its contents.
     */

    public String getRemoteDirectoryPath() {
        return this.remoteDirectoryPath;
    }

    /**
     * <p>
     * Specifies the directory on the remote SFTP server for which you want to list its contents.
     * </p>
     * 
     * @param remoteDirectoryPath
     *        Specifies the directory on the remote SFTP server for which you want to list its contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDirectoryListingRequest withRemoteDirectoryPath(String remoteDirectoryPath) {
        setRemoteDirectoryPath(remoteDirectoryPath);
        return this;
    }

    /**
     * <p>
     * An optional parameter where you can specify the maximum number of file/directory names to retrieve. The default
     * value is 1,000.
     * </p>
     * 
     * @param maxItems
     *        An optional parameter where you can specify the maximum number of file/directory names to retrieve. The
     *        default value is 1,000.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * An optional parameter where you can specify the maximum number of file/directory names to retrieve. The default
     * value is 1,000.
     * </p>
     * 
     * @return An optional parameter where you can specify the maximum number of file/directory names to retrieve. The
     *         default value is 1,000.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * An optional parameter where you can specify the maximum number of file/directory names to retrieve. The default
     * value is 1,000.
     * </p>
     * 
     * @param maxItems
     *        An optional parameter where you can specify the maximum number of file/directory names to retrieve. The
     *        default value is 1,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDirectoryListingRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory listing.
     * </p>
     * 
     * @param outputDirectoryPath
     *        Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory listing.
     */

    public void setOutputDirectoryPath(String outputDirectoryPath) {
        this.outputDirectoryPath = outputDirectoryPath;
    }

    /**
     * <p>
     * Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory listing.
     * </p>
     * 
     * @return Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory
     *         listing.
     */

    public String getOutputDirectoryPath() {
        return this.outputDirectoryPath;
    }

    /**
     * <p>
     * Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory listing.
     * </p>
     * 
     * @param outputDirectoryPath
     *        Specifies the path (bucket and prefix) in Amazon S3 storage to store the results of the directory listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDirectoryListingRequest withOutputDirectoryPath(String outputDirectoryPath) {
        setOutputDirectoryPath(outputDirectoryPath);
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
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getRemoteDirectoryPath() != null)
            sb.append("RemoteDirectoryPath: ").append(getRemoteDirectoryPath()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getOutputDirectoryPath() != null)
            sb.append("OutputDirectoryPath: ").append(getOutputDirectoryPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDirectoryListingRequest == false)
            return false;
        StartDirectoryListingRequest other = (StartDirectoryListingRequest) obj;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getRemoteDirectoryPath() == null ^ this.getRemoteDirectoryPath() == null)
            return false;
        if (other.getRemoteDirectoryPath() != null && other.getRemoteDirectoryPath().equals(this.getRemoteDirectoryPath()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getOutputDirectoryPath() == null ^ this.getOutputDirectoryPath() == null)
            return false;
        if (other.getOutputDirectoryPath() != null && other.getOutputDirectoryPath().equals(this.getOutputDirectoryPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getRemoteDirectoryPath() == null) ? 0 : getRemoteDirectoryPath().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getOutputDirectoryPath() == null) ? 0 : getOutputDirectoryPath().hashCode());
        return hashCode;
    }

    @Override
    public StartDirectoryListingRequest clone() {
        return (StartDirectoryListingRequest) super.clone();
    }

}
