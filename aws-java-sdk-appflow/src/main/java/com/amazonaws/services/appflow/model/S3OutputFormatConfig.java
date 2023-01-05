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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that determines how Amazon AppFlow should format the flow output data when Amazon S3 is used as the
 * destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/S3OutputFormatConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3OutputFormatConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * </p>
     */
    private String fileType;
    /**
     * <p>
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name
     * folders according to the flow frequency and date.
     * </p>
     */
    private PrefixConfig prefixConfig;

    private AggregationConfig aggregationConfig;
    /**
     * <p>
     * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data types
     * in your source data when it writes the output to Amazon S3.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an integer
     * or <code>1</code> in your source data is still an integer in your output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon S3. For
     * example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in the output.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean preserveSourceDataTyping;

    /**
     * <p>
     * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * </p>
     * 
     * @param fileType
     *        Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * @see FileType
     */

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * <p>
     * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * </p>
     * 
     * @return Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * @see FileType
     */

    public String getFileType() {
        return this.fileType;
    }

    /**
     * <p>
     * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * </p>
     * 
     * @param fileType
     *        Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public S3OutputFormatConfig withFileType(String fileType) {
        setFileType(fileType);
        return this;
    }

    /**
     * <p>
     * Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * </p>
     * 
     * @param fileType
     *        Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public S3OutputFormatConfig withFileType(FileType fileType) {
        this.fileType = fileType.toString();
        return this;
    }

    /**
     * <p>
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name
     * folders according to the flow frequency and date.
     * </p>
     * 
     * @param prefixConfig
     *        Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name
     *        folders according to the flow frequency and date.
     */

    public void setPrefixConfig(PrefixConfig prefixConfig) {
        this.prefixConfig = prefixConfig;
    }

    /**
     * <p>
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name
     * folders according to the flow frequency and date.
     * </p>
     * 
     * @return Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can
     *         name folders according to the flow frequency and date.
     */

    public PrefixConfig getPrefixConfig() {
        return this.prefixConfig;
    }

    /**
     * <p>
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name
     * folders according to the flow frequency and date.
     * </p>
     * 
     * @param prefixConfig
     *        Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name
     *        folders according to the flow frequency and date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OutputFormatConfig withPrefixConfig(PrefixConfig prefixConfig) {
        setPrefixConfig(prefixConfig);
        return this;
    }

    /**
     * @param aggregationConfig
     */

    public void setAggregationConfig(AggregationConfig aggregationConfig) {
        this.aggregationConfig = aggregationConfig;
    }

    /**
     * @return
     */

    public AggregationConfig getAggregationConfig() {
        return this.aggregationConfig;
    }

    /**
     * @param aggregationConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OutputFormatConfig withAggregationConfig(AggregationConfig aggregationConfig) {
        setAggregationConfig(aggregationConfig);
        return this;
    }

    /**
     * <p>
     * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data types
     * in your source data when it writes the output to Amazon S3.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an integer
     * or <code>1</code> in your source data is still an integer in your output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon S3. For
     * example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in the output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preserveSourceDataTyping
     *        If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data
     *        types in your source data when it writes the output to Amazon S3. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an
     *        integer or <code>1</code> in your source data is still an integer in your output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon
     *        S3. For example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in
     *        the output.
     *        </p>
     *        </li>
     */

    public void setPreserveSourceDataTyping(Boolean preserveSourceDataTyping) {
        this.preserveSourceDataTyping = preserveSourceDataTyping;
    }

    /**
     * <p>
     * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data types
     * in your source data when it writes the output to Amazon S3.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an integer
     * or <code>1</code> in your source data is still an integer in your output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon S3. For
     * example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in the output.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the
     *         data types in your source data when it writes the output to Amazon S3. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an
     *         integer or <code>1</code> in your source data is still an integer in your output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon
     *         S3. For example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in
     *         the output.
     *         </p>
     *         </li>
     */

    public Boolean getPreserveSourceDataTyping() {
        return this.preserveSourceDataTyping;
    }

    /**
     * <p>
     * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data types
     * in your source data when it writes the output to Amazon S3.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an integer
     * or <code>1</code> in your source data is still an integer in your output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon S3. For
     * example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in the output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preserveSourceDataTyping
     *        If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data
     *        types in your source data when it writes the output to Amazon S3. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an
     *        integer or <code>1</code> in your source data is still an integer in your output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon
     *        S3. For example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in
     *        the output.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OutputFormatConfig withPreserveSourceDataTyping(Boolean preserveSourceDataTyping) {
        setPreserveSourceDataTyping(preserveSourceDataTyping);
        return this;
    }

    /**
     * <p>
     * If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the data types
     * in your source data when it writes the output to Amazon S3.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an integer
     * or <code>1</code> in your source data is still an integer in your output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon S3. For
     * example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in the output.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If your file output format is Parquet, use this parameter to set whether Amazon AppFlow preserves the
     *         data types in your source data when it writes the output to Amazon S3. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: Amazon AppFlow preserves the data types when it writes to Amazon S3. For example, an
     *         integer or <code>1</code> in your source data is still an integer in your output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: Amazon AppFlow converts all of the source data into strings when it writes to Amazon
     *         S3. For example, an integer of <code>1</code> in your source data becomes the string <code>"1"</code> in
     *         the output.
     *         </p>
     *         </li>
     */

    public Boolean isPreserveSourceDataTyping() {
        return this.preserveSourceDataTyping;
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
        if (getFileType() != null)
            sb.append("FileType: ").append(getFileType()).append(",");
        if (getPrefixConfig() != null)
            sb.append("PrefixConfig: ").append(getPrefixConfig()).append(",");
        if (getAggregationConfig() != null)
            sb.append("AggregationConfig: ").append(getAggregationConfig()).append(",");
        if (getPreserveSourceDataTyping() != null)
            sb.append("PreserveSourceDataTyping: ").append(getPreserveSourceDataTyping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OutputFormatConfig == false)
            return false;
        S3OutputFormatConfig other = (S3OutputFormatConfig) obj;
        if (other.getFileType() == null ^ this.getFileType() == null)
            return false;
        if (other.getFileType() != null && other.getFileType().equals(this.getFileType()) == false)
            return false;
        if (other.getPrefixConfig() == null ^ this.getPrefixConfig() == null)
            return false;
        if (other.getPrefixConfig() != null && other.getPrefixConfig().equals(this.getPrefixConfig()) == false)
            return false;
        if (other.getAggregationConfig() == null ^ this.getAggregationConfig() == null)
            return false;
        if (other.getAggregationConfig() != null && other.getAggregationConfig().equals(this.getAggregationConfig()) == false)
            return false;
        if (other.getPreserveSourceDataTyping() == null ^ this.getPreserveSourceDataTyping() == null)
            return false;
        if (other.getPreserveSourceDataTyping() != null && other.getPreserveSourceDataTyping().equals(this.getPreserveSourceDataTyping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileType() == null) ? 0 : getFileType().hashCode());
        hashCode = prime * hashCode + ((getPrefixConfig() == null) ? 0 : getPrefixConfig().hashCode());
        hashCode = prime * hashCode + ((getAggregationConfig() == null) ? 0 : getAggregationConfig().hashCode());
        hashCode = prime * hashCode + ((getPreserveSourceDataTyping() == null) ? 0 : getPreserveSourceDataTyping().hashCode());
        return hashCode;
    }

    @Override
    public S3OutputFormatConfig clone() {
        try {
            return (S3OutputFormatConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.S3OutputFormatConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
