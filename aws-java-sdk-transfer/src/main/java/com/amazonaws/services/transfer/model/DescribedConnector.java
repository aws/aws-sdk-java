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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the parameters for the connector, as identified by the <code>ConnectorId</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedConnector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the connector.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     */
    private String url;
    /**
     * <p>
     * A structure that contains the parameters for a connector object.
     * </p>
     */
    private As2ConnectorConfig as2Config;
    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     */
    private String accessRole;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for connectors.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the connector.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the connector.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the connector.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) for the connector.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the connector.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public DescribedConnector withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     * 
     * @param url
     *        The URL of the partner's AS2 endpoint.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     * 
     * @return The URL of the partner's AS2 endpoint.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     * 
     * @param url
     *        The URL of the partner's AS2 endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * A structure that contains the parameters for a connector object.
     * </p>
     * 
     * @param as2Config
     *        A structure that contains the parameters for a connector object.
     */

    public void setAs2Config(As2ConnectorConfig as2Config) {
        this.as2Config = as2Config;
    }

    /**
     * <p>
     * A structure that contains the parameters for a connector object.
     * </p>
     * 
     * @return A structure that contains the parameters for a connector object.
     */

    public As2ConnectorConfig getAs2Config() {
        return this.as2Config;
    }

    /**
     * <p>
     * A structure that contains the parameters for a connector object.
     * </p>
     * 
     * @param as2Config
     *        A structure that contains the parameters for a connector object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withAs2Config(As2ConnectorConfig as2Config) {
        setAs2Config(as2Config);
        return this;
    }

    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * 
     * @param accessRole
     *        With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *        the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *        <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *        temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *        write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *        needs to provide read and write access to the parent directory of the file location used in the
     *        <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *        parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     */

    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * 
     * @return With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *         the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *         <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *         temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *         write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *         needs to provide read and write access to the parent directory of the file location used in the
     *         <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *         parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     */

    public String getAccessRole() {
        return this.accessRole;
    }

    /**
     * <p>
     * With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in the
     * request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     * <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     * temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a
     * final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code> needs to
     * provide read and write access to the parent directory of the file location used in the
     * <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the parent
     * directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * </p>
     * 
     * @param accessRole
     *        With AS2, you can send files by calling <code>StartFileTransfer</code> and specifying the file paths in
     *        the request parameter, <code>SendFilePaths</code>. We use the file’s parent directory (for example, for
     *        <code>--send-file-paths /bucket/dir/file.txt</code>, parent directory is <code>/bucket/dir/</code>) to
     *        temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and
     *        write a final JSON file containing relevant metadata of the transmission. So, the <code>AccessRole</code>
     *        needs to provide read and write access to the parent directory of the file location used in the
     *        <code>StartFileTransfer</code> request. Additionally, you need to provide read and write access to the
     *        parent directory of the files that you intend to send with <code>StartFileTransfer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withAccessRole(String accessRole) {
        setAccessRole(accessRole);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to
     *        turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your
     *        CloudWatch logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector
     *         to turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your
     *         CloudWatch logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn
     * on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to
     *        turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your
     *        CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for connectors.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for connectors.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for connectors.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for connectors.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for connectors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for connectors.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedConnector withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getAs2Config() != null)
            sb.append("As2Config: ").append(getAs2Config()).append(",");
        if (getAccessRole() != null)
            sb.append("AccessRole: ").append(getAccessRole()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
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

        if (obj instanceof DescribedConnector == false)
            return false;
        DescribedConnector other = (DescribedConnector) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getAs2Config() == null ^ this.getAs2Config() == null)
            return false;
        if (other.getAs2Config() != null && other.getAs2Config().equals(this.getAs2Config()) == false)
            return false;
        if (other.getAccessRole() == null ^ this.getAccessRole() == null)
            return false;
        if (other.getAccessRole() != null && other.getAccessRole().equals(this.getAccessRole()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getAs2Config() == null) ? 0 : getAs2Config().hashCode());
        hashCode = prime * hashCode + ((getAccessRole() == null) ? 0 : getAccessRole().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribedConnector clone() {
        try {
            return (DescribedConnector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
