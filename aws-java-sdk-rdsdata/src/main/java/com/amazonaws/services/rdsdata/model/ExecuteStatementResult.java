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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response elements represent the output of a request to run a SQL statement against a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code> parameter is
     * set to <code>JSON</code>.
     * </p>
     */
    private java.util.List<java.util.List<Field>> records;
    /**
     * <p>
     * Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     * parameter is set to <code>JSON</code>.
     * </p>
     */
    private java.util.List<ColumnMetadata> columnMetadata;
    /**
     * <p>
     * The number of records updated by the request.
     * </p>
     */
    private Long numberOfRecordsUpdated;
    /**
     * <p>
     * Values for fields generated during a DML request.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * </pre>
     */
    private java.util.List<Field> generatedFields;
    /**
     * <p>
     * A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This value is
     * only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.
     * </p>
     * <p>
     * The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set
     * requires more than 10 MB, the call returns an error.
     * </p>
     */
    private String formattedRecords;

    /**
     * <p>
     * The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code> parameter is
     * set to <code>JSON</code>.
     * </p>
     * 
     * @return The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code>
     *         parameter is set to <code>JSON</code>.
     */

    public java.util.List<java.util.List<Field>> getRecords() {
        return records;
    }

    /**
     * <p>
     * The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code> parameter is
     * set to <code>JSON</code>.
     * </p>
     * 
     * @param records
     *        The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code>
     *        parameter is set to <code>JSON</code>.
     */

    public void setRecords(java.util.Collection<java.util.List<Field>> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<java.util.List<Field>>(records);
    }

    /**
     * <p>
     * The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code> parameter is
     * set to <code>JSON</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code>
     *        parameter is set to <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withRecords(java.util.List<Field>... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<java.util.List<Field>>(records.length));
        }
        for (java.util.List<Field> ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code> parameter is
     * set to <code>JSON</code>.
     * </p>
     * 
     * @param records
     *        The records returned by the SQL statement. This field is blank if the <code>formatRecordsAs</code>
     *        parameter is set to <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withRecords(java.util.Collection<java.util.List<Field>> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     * parameter is set to <code>JSON</code>.
     * </p>
     * 
     * @return Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     *         parameter is set to <code>JSON</code>.
     */

    public java.util.List<ColumnMetadata> getColumnMetadata() {
        return columnMetadata;
    }

    /**
     * <p>
     * Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     * parameter is set to <code>JSON</code>.
     * </p>
     * 
     * @param columnMetadata
     *        Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     *        parameter is set to <code>JSON</code>.
     */

    public void setColumnMetadata(java.util.Collection<ColumnMetadata> columnMetadata) {
        if (columnMetadata == null) {
            this.columnMetadata = null;
            return;
        }

        this.columnMetadata = new java.util.ArrayList<ColumnMetadata>(columnMetadata);
    }

    /**
     * <p>
     * Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     * parameter is set to <code>JSON</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnMetadata(java.util.Collection)} or {@link #withColumnMetadata(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param columnMetadata
     *        Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     *        parameter is set to <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withColumnMetadata(ColumnMetadata... columnMetadata) {
        if (this.columnMetadata == null) {
            setColumnMetadata(new java.util.ArrayList<ColumnMetadata>(columnMetadata.length));
        }
        for (ColumnMetadata ele : columnMetadata) {
            this.columnMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     * parameter is set to <code>JSON</code>.
     * </p>
     * 
     * @param columnMetadata
     *        Metadata for the columns included in the results. This field is blank if the <code>formatRecordsAs</code>
     *        parameter is set to <code>JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withColumnMetadata(java.util.Collection<ColumnMetadata> columnMetadata) {
        setColumnMetadata(columnMetadata);
        return this;
    }

    /**
     * <p>
     * The number of records updated by the request.
     * </p>
     * 
     * @param numberOfRecordsUpdated
     *        The number of records updated by the request.
     */

    public void setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
    }

    /**
     * <p>
     * The number of records updated by the request.
     * </p>
     * 
     * @return The number of records updated by the request.
     */

    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

    /**
     * <p>
     * The number of records updated by the request.
     * </p>
     * 
     * @param numberOfRecordsUpdated
     *        The number of records updated by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        setNumberOfRecordsUpdated(numberOfRecordsUpdated);
        return this;
    }

    /**
     * <p>
     * Values for fields generated during a DML request.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @return Values for fields generated during a DML request.</p>
     * 
     * <pre><code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     */

    public java.util.List<Field> getGeneratedFields() {
        return generatedFields;
    }

    /**
     * <p>
     * Values for fields generated during a DML request.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @param generatedFields
     *        Values for fields generated during a DML request.</p>
     * 
     * <pre><code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     */

    public void setGeneratedFields(java.util.Collection<Field> generatedFields) {
        if (generatedFields == null) {
            this.generatedFields = null;
            return;
        }

        this.generatedFields = new java.util.ArrayList<Field>(generatedFields);
    }

    /**
     * <p>
     * Values for fields generated during a DML request.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * </pre>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeneratedFields(java.util.Collection)} or {@link #withGeneratedFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param generatedFields
     *        Values for fields generated during a DML request.</p>
     * 
     *        <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withGeneratedFields(Field... generatedFields) {
        if (this.generatedFields == null) {
            setGeneratedFields(new java.util.ArrayList<Field>(generatedFields.length));
        }
        for (Field ele : generatedFields) {
            this.generatedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values for fields generated during a DML request.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @param generatedFields
     *        Values for fields generated during a DML request.</p>
     * 
     *        <pre>
     * <code> &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withGeneratedFields(java.util.Collection<Field> generatedFields) {
        setGeneratedFields(generatedFields);
        return this;
    }

    /**
     * <p>
     * A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This value is
     * only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.
     * </p>
     * <p>
     * The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set
     * requires more than 10 MB, the call returns an error.
     * </p>
     * 
     * @param formattedRecords
     *        A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This
     *        value is only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.</p>
     *        <p>
     *        The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set
     *        requires more than 10 MB, the call returns an error.
     */

    public void setFormattedRecords(String formattedRecords) {
        this.formattedRecords = formattedRecords;
    }

    /**
     * <p>
     * A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This value is
     * only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.
     * </p>
     * <p>
     * The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set
     * requires more than 10 MB, the call returns an error.
     * </p>
     * 
     * @return A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This
     *         value is only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.</p>
     *         <p>
     *         The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result
     *         set requires more than 10 MB, the call returns an error.
     */

    public String getFormattedRecords() {
        return this.formattedRecords;
    }

    /**
     * <p>
     * A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This value is
     * only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.
     * </p>
     * <p>
     * The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set
     * requires more than 10 MB, the call returns an error.
     * </p>
     * 
     * @param formattedRecords
     *        A string value that represents the result set of a <code>SELECT</code> statement in JSON format. This
     *        value is only present when the <code>formatRecordsAs</code> parameter is set to <code>JSON</code>.</p>
     *        <p>
     *        The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set
     *        requires more than 10 MB, the call returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withFormattedRecords(String formattedRecords) {
        setFormattedRecords(formattedRecords);
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getColumnMetadata() != null)
            sb.append("ColumnMetadata: ").append(getColumnMetadata()).append(",");
        if (getNumberOfRecordsUpdated() != null)
            sb.append("NumberOfRecordsUpdated: ").append(getNumberOfRecordsUpdated()).append(",");
        if (getGeneratedFields() != null)
            sb.append("GeneratedFields: ").append(getGeneratedFields()).append(",");
        if (getFormattedRecords() != null)
            sb.append("FormattedRecords: ").append(getFormattedRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteStatementResult == false)
            return false;
        ExecuteStatementResult other = (ExecuteStatementResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getColumnMetadata() == null ^ this.getColumnMetadata() == null)
            return false;
        if (other.getColumnMetadata() != null && other.getColumnMetadata().equals(this.getColumnMetadata()) == false)
            return false;
        if (other.getNumberOfRecordsUpdated() == null ^ this.getNumberOfRecordsUpdated() == null)
            return false;
        if (other.getNumberOfRecordsUpdated() != null && other.getNumberOfRecordsUpdated().equals(this.getNumberOfRecordsUpdated()) == false)
            return false;
        if (other.getGeneratedFields() == null ^ this.getGeneratedFields() == null)
            return false;
        if (other.getGeneratedFields() != null && other.getGeneratedFields().equals(this.getGeneratedFields()) == false)
            return false;
        if (other.getFormattedRecords() == null ^ this.getFormattedRecords() == null)
            return false;
        if (other.getFormattedRecords() != null && other.getFormattedRecords().equals(this.getFormattedRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getColumnMetadata() == null) ? 0 : getColumnMetadata().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecordsUpdated() == null) ? 0 : getNumberOfRecordsUpdated().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFields() == null) ? 0 : getGeneratedFields().hashCode());
        hashCode = prime * hashCode + ((getFormattedRecords() == null) ? 0 : getFormattedRecords().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementResult clone() {
        try {
            return (ExecuteStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
