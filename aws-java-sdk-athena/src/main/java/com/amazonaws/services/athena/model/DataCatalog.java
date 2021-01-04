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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a data catalog in an AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DataCatalog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCatalog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the data catalog.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values depend on
     * the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     * 
     * @param name
     *        The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of
     *        128 alphanumeric, underscore, at sign, or hyphen characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     * 
     * @return The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum
     *         of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     * 
     * @param name
     *        The name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of
     *        128 alphanumeric, underscore, at sign, or hyphen characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalog withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the data catalog.
     * </p>
     * 
     * @param description
     *        An optional description of the data catalog.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the data catalog.
     * </p>
     * 
     * @return An optional description of the data catalog.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the data catalog.
     * </p>
     * 
     * @param description
     *        An optional description of the data catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalog withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * 
     * @param type
     *        The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue
     *        Catalog, or <code>HIVE</code> for an external hive metastore.
     * @see DataCatalogType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * 
     * @return The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue
     *         Catalog, or <code>HIVE</code> for an external hive metastore.
     * @see DataCatalogType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * 
     * @param type
     *        The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue
     *        Catalog, or <code>HIVE</code> for an external hive metastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCatalogType
     */

    public DataCatalog withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue Catalog, or
     * <code>HIVE</code> for an external hive metastore.
     * </p>
     * 
     * @param type
     *        The type of data catalog: <code>LAMBDA</code> for a federated catalog, <code>GLUE</code> for AWS Glue
     *        Catalog, or <code>HIVE</code> for an external hive metastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCatalogType
     */

    public DataCatalog withType(DataCatalogType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values depend on
     * the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values
     *         depend on the catalog type. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     *         parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently
     *         supported version.
     *         </p>
     *         <p>
     *         <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but
     *         not both.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you have one Lambda function that processes metadata and another for reading the actual data, use the
     *         following syntax. Both parameters are required.
     *         </p>
     *         <p>
     *         <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have a composite Lambda function that processes both metadata and data, use the following syntax
     *         to specify your Lambda function.
     *         </p>
     *         <p>
     *         <code>function=<i>lambda_arn</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>GLUE</code> type has no parameters.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values depend on
     * the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values
     *        depend on the catalog type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     *        parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently
     *        supported version.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but
     *        not both.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have one Lambda function that processes metadata and another for reading the actual data, use the
     *        following syntax. Both parameters are required.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     *        specify your Lambda function.
     *        </p>
     *        <p>
     *        <code>function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>GLUE</code> type has no parameters.
     *        </p>
     *        </li>
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values depend on
     * the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The <code>GLUE</code> type has no parameters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values
     *        depend on the catalog type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     *        parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently
     *        supported version.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but
     *        not both.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have one Lambda function that processes metadata and another for reading the actual data, use the
     *        following syntax. Both parameters are required.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     *        specify your Lambda function.
     *        </p>
     *        <p>
     *        <code>function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>GLUE</code> type has no parameters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalog withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see DataCatalog#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalog addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalog clearParametersEntries() {
        this.parameters = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCatalog == false)
            return false;
        DataCatalog other = (DataCatalog) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public DataCatalog clone() {
        try {
            return (DataCatalog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.DataCatalogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
