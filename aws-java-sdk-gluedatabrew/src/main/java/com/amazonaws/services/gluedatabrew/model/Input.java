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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information on how DataBrew can find data, in either the Glue Data Catalog or Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Input" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Input implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location where the data is stored.
     * </p>
     */
    private S3Location s3InputDefinition;
    /**
     * <p>
     * The Glue Data Catalog parameters for the data.
     * </p>
     */
    private DataCatalogInputDefinition dataCatalogInputDefinition;
    /**
     * <p>
     * Connection information for dataset input files stored in a database.
     * </p>
     */
    private DatabaseInputDefinition databaseInputDefinition;

    /**
     * <p>
     * The Amazon S3 location where the data is stored.
     * </p>
     * 
     * @param s3InputDefinition
     *        The Amazon S3 location where the data is stored.
     */

    public void setS3InputDefinition(S3Location s3InputDefinition) {
        this.s3InputDefinition = s3InputDefinition;
    }

    /**
     * <p>
     * The Amazon S3 location where the data is stored.
     * </p>
     * 
     * @return The Amazon S3 location where the data is stored.
     */

    public S3Location getS3InputDefinition() {
        return this.s3InputDefinition;
    }

    /**
     * <p>
     * The Amazon S3 location where the data is stored.
     * </p>
     * 
     * @param s3InputDefinition
     *        The Amazon S3 location where the data is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withS3InputDefinition(S3Location s3InputDefinition) {
        setS3InputDefinition(s3InputDefinition);
        return this;
    }

    /**
     * <p>
     * The Glue Data Catalog parameters for the data.
     * </p>
     * 
     * @param dataCatalogInputDefinition
     *        The Glue Data Catalog parameters for the data.
     */

    public void setDataCatalogInputDefinition(DataCatalogInputDefinition dataCatalogInputDefinition) {
        this.dataCatalogInputDefinition = dataCatalogInputDefinition;
    }

    /**
     * <p>
     * The Glue Data Catalog parameters for the data.
     * </p>
     * 
     * @return The Glue Data Catalog parameters for the data.
     */

    public DataCatalogInputDefinition getDataCatalogInputDefinition() {
        return this.dataCatalogInputDefinition;
    }

    /**
     * <p>
     * The Glue Data Catalog parameters for the data.
     * </p>
     * 
     * @param dataCatalogInputDefinition
     *        The Glue Data Catalog parameters for the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withDataCatalogInputDefinition(DataCatalogInputDefinition dataCatalogInputDefinition) {
        setDataCatalogInputDefinition(dataCatalogInputDefinition);
        return this;
    }

    /**
     * <p>
     * Connection information for dataset input files stored in a database.
     * </p>
     * 
     * @param databaseInputDefinition
     *        Connection information for dataset input files stored in a database.
     */

    public void setDatabaseInputDefinition(DatabaseInputDefinition databaseInputDefinition) {
        this.databaseInputDefinition = databaseInputDefinition;
    }

    /**
     * <p>
     * Connection information for dataset input files stored in a database.
     * </p>
     * 
     * @return Connection information for dataset input files stored in a database.
     */

    public DatabaseInputDefinition getDatabaseInputDefinition() {
        return this.databaseInputDefinition;
    }

    /**
     * <p>
     * Connection information for dataset input files stored in a database.
     * </p>
     * 
     * @param databaseInputDefinition
     *        Connection information for dataset input files stored in a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withDatabaseInputDefinition(DatabaseInputDefinition databaseInputDefinition) {
        setDatabaseInputDefinition(databaseInputDefinition);
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
        if (getS3InputDefinition() != null)
            sb.append("S3InputDefinition: ").append(getS3InputDefinition()).append(",");
        if (getDataCatalogInputDefinition() != null)
            sb.append("DataCatalogInputDefinition: ").append(getDataCatalogInputDefinition()).append(",");
        if (getDatabaseInputDefinition() != null)
            sb.append("DatabaseInputDefinition: ").append(getDatabaseInputDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;
        if (other.getS3InputDefinition() == null ^ this.getS3InputDefinition() == null)
            return false;
        if (other.getS3InputDefinition() != null && other.getS3InputDefinition().equals(this.getS3InputDefinition()) == false)
            return false;
        if (other.getDataCatalogInputDefinition() == null ^ this.getDataCatalogInputDefinition() == null)
            return false;
        if (other.getDataCatalogInputDefinition() != null && other.getDataCatalogInputDefinition().equals(this.getDataCatalogInputDefinition()) == false)
            return false;
        if (other.getDatabaseInputDefinition() == null ^ this.getDatabaseInputDefinition() == null)
            return false;
        if (other.getDatabaseInputDefinition() != null && other.getDatabaseInputDefinition().equals(this.getDatabaseInputDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3InputDefinition() == null) ? 0 : getS3InputDefinition().hashCode());
        hashCode = prime * hashCode + ((getDataCatalogInputDefinition() == null) ? 0 : getDataCatalogInputDefinition().hashCode());
        hashCode = prime * hashCode + ((getDatabaseInputDefinition() == null) ? 0 : getDatabaseInputDefinition().hashCode());
        return hashCode;
    }

    @Override
    public Input clone() {
        try {
            return (Input) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.InputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
