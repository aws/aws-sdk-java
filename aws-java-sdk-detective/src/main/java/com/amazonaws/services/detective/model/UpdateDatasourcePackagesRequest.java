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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateDatasourcePackages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatasourcePackagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The data source package start for the behavior graph.
     * </p>
     */
    private java.util.List<String> datasourcePackages;

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @return The ARN of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasourcePackagesRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The data source package start for the behavior graph.
     * </p>
     * 
     * @return The data source package start for the behavior graph.
     * @see DatasourcePackage
     */

    public java.util.List<String> getDatasourcePackages() {
        return datasourcePackages;
    }

    /**
     * <p>
     * The data source package start for the behavior graph.
     * </p>
     * 
     * @param datasourcePackages
     *        The data source package start for the behavior graph.
     * @see DatasourcePackage
     */

    public void setDatasourcePackages(java.util.Collection<String> datasourcePackages) {
        if (datasourcePackages == null) {
            this.datasourcePackages = null;
            return;
        }

        this.datasourcePackages = new java.util.ArrayList<String>(datasourcePackages);
    }

    /**
     * <p>
     * The data source package start for the behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasourcePackages(java.util.Collection)} or {@link #withDatasourcePackages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param datasourcePackages
     *        The data source package start for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasourcePackage
     */

    public UpdateDatasourcePackagesRequest withDatasourcePackages(String... datasourcePackages) {
        if (this.datasourcePackages == null) {
            setDatasourcePackages(new java.util.ArrayList<String>(datasourcePackages.length));
        }
        for (String ele : datasourcePackages) {
            this.datasourcePackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data source package start for the behavior graph.
     * </p>
     * 
     * @param datasourcePackages
     *        The data source package start for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasourcePackage
     */

    public UpdateDatasourcePackagesRequest withDatasourcePackages(java.util.Collection<String> datasourcePackages) {
        setDatasourcePackages(datasourcePackages);
        return this;
    }

    /**
     * <p>
     * The data source package start for the behavior graph.
     * </p>
     * 
     * @param datasourcePackages
     *        The data source package start for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasourcePackage
     */

    public UpdateDatasourcePackagesRequest withDatasourcePackages(DatasourcePackage... datasourcePackages) {
        java.util.ArrayList<String> datasourcePackagesCopy = new java.util.ArrayList<String>(datasourcePackages.length);
        for (DatasourcePackage value : datasourcePackages) {
            datasourcePackagesCopy.add(value.toString());
        }
        if (getDatasourcePackages() == null) {
            setDatasourcePackages(datasourcePackagesCopy);
        } else {
            getDatasourcePackages().addAll(datasourcePackagesCopy);
        }
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getDatasourcePackages() != null)
            sb.append("DatasourcePackages: ").append(getDatasourcePackages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasourcePackagesRequest == false)
            return false;
        UpdateDatasourcePackagesRequest other = (UpdateDatasourcePackagesRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getDatasourcePackages() == null ^ this.getDatasourcePackages() == null)
            return false;
        if (other.getDatasourcePackages() != null && other.getDatasourcePackages().equals(this.getDatasourcePackages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getDatasourcePackages() == null) ? 0 : getDatasourcePackages().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasourcePackagesRequest clone() {
        return (UpdateDatasourcePackagesRequest) super.clone();
    }

}
