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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/FailoverGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the Neptune global database that should be failed over. The identifier is the unique key assigned
     * by the user when the Neptune global database was created. In other words, it's the name of the global database
     * that you want to fail over.
     * </p>
     * <p>
     * Constraints: Must match the identifier of an existing Neptune global database.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for the
     * global database.
     * </p>
     */
    private String targetDbClusterIdentifier;

    /**
     * <p>
     * Identifier of the Neptune global database that should be failed over. The identifier is the unique key assigned
     * by the user when the Neptune global database was created. In other words, it's the name of the global database
     * that you want to fail over.
     * </p>
     * <p>
     * Constraints: Must match the identifier of an existing Neptune global database.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        Identifier of the Neptune global database that should be failed over. The identifier is the unique key
     *        assigned by the user when the Neptune global database was created. In other words, it's the name of the
     *        global database that you want to fail over.</p>
     *        <p>
     *        Constraints: Must match the identifier of an existing Neptune global database.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * Identifier of the Neptune global database that should be failed over. The identifier is the unique key assigned
     * by the user when the Neptune global database was created. In other words, it's the name of the global database
     * that you want to fail over.
     * </p>
     * <p>
     * Constraints: Must match the identifier of an existing Neptune global database.
     * </p>
     * 
     * @return Identifier of the Neptune global database that should be failed over. The identifier is the unique key
     *         assigned by the user when the Neptune global database was created. In other words, it's the name of the
     *         global database that you want to fail over.</p>
     *         <p>
     *         Constraints: Must match the identifier of an existing Neptune global database.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * Identifier of the Neptune global database that should be failed over. The identifier is the unique key assigned
     * by the user when the Neptune global database was created. In other words, it's the name of the global database
     * that you want to fail over.
     * </p>
     * <p>
     * Constraints: Must match the identifier of an existing Neptune global database.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        Identifier of the Neptune global database that should be failed over. The identifier is the unique key
     *        assigned by the user when the Neptune global database was created. In other words, it's the name of the
     *        global database that you want to fail over.</p>
     *        <p>
     *        Constraints: Must match the identifier of an existing Neptune global database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for the
     * global database.
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for
     *        the global database.
     */

    public void setTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        this.targetDbClusterIdentifier = targetDbClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for the
     * global database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary
     *         for the global database.
     */

    public String getTargetDbClusterIdentifier() {
        return this.targetDbClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for the
     * global database.
     * </p>
     * 
     * @param targetDbClusterIdentifier
     *        The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for
     *        the global database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverGlobalClusterRequest withTargetDbClusterIdentifier(String targetDbClusterIdentifier) {
        setTargetDbClusterIdentifier(targetDbClusterIdentifier);
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getTargetDbClusterIdentifier() != null)
            sb.append("TargetDbClusterIdentifier: ").append(getTargetDbClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverGlobalClusterRequest == false)
            return false;
        FailoverGlobalClusterRequest other = (FailoverGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getTargetDbClusterIdentifier() == null ^ this.getTargetDbClusterIdentifier() == null)
            return false;
        if (other.getTargetDbClusterIdentifier() != null && other.getTargetDbClusterIdentifier().equals(this.getTargetDbClusterIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDbClusterIdentifier() == null) ? 0 : getTargetDbClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public FailoverGlobalClusterRequest clone() {
        return (FailoverGlobalClusterRequest) super.clone();
    }

}
