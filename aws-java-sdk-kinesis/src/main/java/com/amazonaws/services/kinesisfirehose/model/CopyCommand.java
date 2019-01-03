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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a <code>COPY</code> command for Amazon Redshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/CopyCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyCommand implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the target table. The table must already exist in the database.
     * </p>
     */
    private String dataTableName;
    /**
     * <p>
     * A comma-separated list of column names.
     * </p>
     */
    private String dataTableColumns;
    /**
     * <p>
     * Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see the
     * "Optional Parameters" section of <a href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon
     * Redshift COPY command</a>. Some possible examples that would apply to Kinesis Data Firehose are as follows:
     * </p>
     * <p>
     * <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using lzop.
     * </p>
     * <p>
     * <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     * </p>
     * <p>
     * <code>delimiter '|' escape</code> - the delimiter should be escaped.
     * </p>
     * <p>
     * <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are fixed width
     * in the source, with each width specified after every column in the table.
     * </p>
     * <p>
     * <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the format of
     * the data.
     * </p>
     * <p>
     * For more examples, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY command
     * examples</a>.
     * </p>
     */
    private String copyOptions;

    /**
     * <p>
     * The name of the target table. The table must already exist in the database.
     * </p>
     * 
     * @param dataTableName
     *        The name of the target table. The table must already exist in the database.
     */

    public void setDataTableName(String dataTableName) {
        this.dataTableName = dataTableName;
    }

    /**
     * <p>
     * The name of the target table. The table must already exist in the database.
     * </p>
     * 
     * @return The name of the target table. The table must already exist in the database.
     */

    public String getDataTableName() {
        return this.dataTableName;
    }

    /**
     * <p>
     * The name of the target table. The table must already exist in the database.
     * </p>
     * 
     * @param dataTableName
     *        The name of the target table. The table must already exist in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyCommand withDataTableName(String dataTableName) {
        setDataTableName(dataTableName);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of column names.
     * </p>
     * 
     * @param dataTableColumns
     *        A comma-separated list of column names.
     */

    public void setDataTableColumns(String dataTableColumns) {
        this.dataTableColumns = dataTableColumns;
    }

    /**
     * <p>
     * A comma-separated list of column names.
     * </p>
     * 
     * @return A comma-separated list of column names.
     */

    public String getDataTableColumns() {
        return this.dataTableColumns;
    }

    /**
     * <p>
     * A comma-separated list of column names.
     * </p>
     * 
     * @param dataTableColumns
     *        A comma-separated list of column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyCommand withDataTableColumns(String dataTableColumns) {
        setDataTableColumns(dataTableColumns);
        return this;
    }

    /**
     * <p>
     * Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see the
     * "Optional Parameters" section of <a href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon
     * Redshift COPY command</a>. Some possible examples that would apply to Kinesis Data Firehose are as follows:
     * </p>
     * <p>
     * <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using lzop.
     * </p>
     * <p>
     * <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     * </p>
     * <p>
     * <code>delimiter '|' escape</code> - the delimiter should be escaped.
     * </p>
     * <p>
     * <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are fixed width
     * in the source, with each width specified after every column in the table.
     * </p>
     * <p>
     * <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the format of
     * the data.
     * </p>
     * <p>
     * For more examples, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY command
     * examples</a>.
     * </p>
     * 
     * @param copyOptions
     *        Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see
     *        the "Optional Parameters" section of <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon Redshift COPY command</a>. Some
     *        possible examples that would apply to Kinesis Data Firehose are as follows:</p>
     *        <p>
     *        <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using
     *        lzop.
     *        </p>
     *        <p>
     *        <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     *        </p>
     *        <p>
     *        <code>delimiter '|' escape</code> - the delimiter should be escaped.
     *        </p>
     *        <p>
     *        <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are fixed
     *        width in the source, with each width specified after every column in the table.
     *        </p>
     *        <p>
     *        <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the
     *        format of the data.
     *        </p>
     *        <p>
     *        For more examples, see <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY
     *        command examples</a>.
     */

    public void setCopyOptions(String copyOptions) {
        this.copyOptions = copyOptions;
    }

    /**
     * <p>
     * Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see the
     * "Optional Parameters" section of <a href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon
     * Redshift COPY command</a>. Some possible examples that would apply to Kinesis Data Firehose are as follows:
     * </p>
     * <p>
     * <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using lzop.
     * </p>
     * <p>
     * <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     * </p>
     * <p>
     * <code>delimiter '|' escape</code> - the delimiter should be escaped.
     * </p>
     * <p>
     * <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are fixed width
     * in the source, with each width specified after every column in the table.
     * </p>
     * <p>
     * <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the format of
     * the data.
     * </p>
     * <p>
     * For more examples, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY command
     * examples</a>.
     * </p>
     * 
     * @return Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see
     *         the "Optional Parameters" section of <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon Redshift COPY command</a>. Some
     *         possible examples that would apply to Kinesis Data Firehose are as follows:</p>
     *         <p>
     *         <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using
     *         lzop.
     *         </p>
     *         <p>
     *         <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     *         </p>
     *         <p>
     *         <code>delimiter '|' escape</code> - the delimiter should be escaped.
     *         </p>
     *         <p>
     *         <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are
     *         fixed width in the source, with each width specified after every column in the table.
     *         </p>
     *         <p>
     *         <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the
     *         format of the data.
     *         </p>
     *         <p>
     *         For more examples, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY
     *         command examples</a>.
     */

    public String getCopyOptions() {
        return this.copyOptions;
    }

    /**
     * <p>
     * Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see the
     * "Optional Parameters" section of <a href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon
     * Redshift COPY command</a>. Some possible examples that would apply to Kinesis Data Firehose are as follows:
     * </p>
     * <p>
     * <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using lzop.
     * </p>
     * <p>
     * <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     * </p>
     * <p>
     * <code>delimiter '|' escape</code> - the delimiter should be escaped.
     * </p>
     * <p>
     * <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are fixed width
     * in the source, with each width specified after every column in the table.
     * </p>
     * <p>
     * <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the format of
     * the data.
     * </p>
     * <p>
     * For more examples, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY command
     * examples</a>.
     * </p>
     * 
     * @param copyOptions
     *        Optional parameters to use with the Amazon Redshift <code>COPY</code> command. For more information, see
     *        the "Optional Parameters" section of <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY.html">Amazon Redshift COPY command</a>. Some
     *        possible examples that would apply to Kinesis Data Firehose are as follows:</p>
     *        <p>
     *        <code>delimiter '\t' lzop;</code> - fields are delimited with "\t" (TAB character) and compressed using
     *        lzop.
     *        </p>
     *        <p>
     *        <code>delimiter '|'</code> - fields are delimited with "|" (this is the default delimiter).
     *        </p>
     *        <p>
     *        <code>delimiter '|' escape</code> - the delimiter should be escaped.
     *        </p>
     *        <p>
     *        <code>fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6'</code> - fields are fixed
     *        width in the source, with each width specified after every column in the table.
     *        </p>
     *        <p>
     *        <code>JSON 's3://mybucket/jsonpaths.txt'</code> - data is in JSON format, and the path specified is the
     *        format of the data.
     *        </p>
     *        <p>
     *        For more examples, see <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_COPY_command_examples.html">Amazon Redshift COPY
     *        command examples</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyCommand withCopyOptions(String copyOptions) {
        setCopyOptions(copyOptions);
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
        if (getDataTableName() != null)
            sb.append("DataTableName: ").append(getDataTableName()).append(",");
        if (getDataTableColumns() != null)
            sb.append("DataTableColumns: ").append(getDataTableColumns()).append(",");
        if (getCopyOptions() != null)
            sb.append("CopyOptions: ").append(getCopyOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyCommand == false)
            return false;
        CopyCommand other = (CopyCommand) obj;
        if (other.getDataTableName() == null ^ this.getDataTableName() == null)
            return false;
        if (other.getDataTableName() != null && other.getDataTableName().equals(this.getDataTableName()) == false)
            return false;
        if (other.getDataTableColumns() == null ^ this.getDataTableColumns() == null)
            return false;
        if (other.getDataTableColumns() != null && other.getDataTableColumns().equals(this.getDataTableColumns()) == false)
            return false;
        if (other.getCopyOptions() == null ^ this.getCopyOptions() == null)
            return false;
        if (other.getCopyOptions() != null && other.getCopyOptions().equals(this.getCopyOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataTableName() == null) ? 0 : getDataTableName().hashCode());
        hashCode = prime * hashCode + ((getDataTableColumns() == null) ? 0 : getDataTableColumns().hashCode());
        hashCode = prime * hashCode + ((getCopyOptions() == null) ? 0 : getCopyOptions().hashCode());
        return hashCode;
    }

    @Override
    public CopyCommand clone() {
        try {
            return (CopyCommand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.CopyCommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
