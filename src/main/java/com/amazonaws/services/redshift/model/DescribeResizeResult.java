/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the result of a cluster resize operation.
 * </p>
 */
public class DescribeResizeResult implements Serializable {

    /**
     * The node type that the cluster will have after the resize is complete.
     */
    private String targetNodeType;

    /**
     * The number of nodes that the cluster will have after the resize is
     * complete.
     */
    private Integer targetNumberOfNodes;

    /**
     * The cluster type after the resize is complete. <p>Valid Values:
     * <code>multi-node</code> | <code>single-node</code>
     */
    private String targetClusterType;

    /**
     * The status of the resize operation. <p>Valid Values: <code>NONE</code>
     * | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     * <code>SUCCEEDED</code>
     */
    private String status;

    /**
     * The names of tables that have been completely imported . <p>Valid
     * Values: List of table names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesCompleted;

    /**
     * The names of tables that are being currently imported. <p>Valid
     * Values: List of table names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesInProgress;

    /**
     * The names of tables that have not been yet imported. <p>Valid Values:
     * List of table names
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesNotStarted;

    /**
     * The node type that the cluster will have after the resize is complete.
     *
     * @return The node type that the cluster will have after the resize is complete.
     */
    public String getTargetNodeType() {
        return targetNodeType;
    }
    
    /**
     * The node type that the cluster will have after the resize is complete.
     *
     * @param targetNodeType The node type that the cluster will have after the resize is complete.
     */
    public void setTargetNodeType(String targetNodeType) {
        this.targetNodeType = targetNodeType;
    }
    
    /**
     * The node type that the cluster will have after the resize is complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetNodeType The node type that the cluster will have after the resize is complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withTargetNodeType(String targetNodeType) {
        this.targetNodeType = targetNodeType;
        return this;
    }

    /**
     * The number of nodes that the cluster will have after the resize is
     * complete.
     *
     * @return The number of nodes that the cluster will have after the resize is
     *         complete.
     */
    public Integer getTargetNumberOfNodes() {
        return targetNumberOfNodes;
    }
    
    /**
     * The number of nodes that the cluster will have after the resize is
     * complete.
     *
     * @param targetNumberOfNodes The number of nodes that the cluster will have after the resize is
     *         complete.
     */
    public void setTargetNumberOfNodes(Integer targetNumberOfNodes) {
        this.targetNumberOfNodes = targetNumberOfNodes;
    }
    
    /**
     * The number of nodes that the cluster will have after the resize is
     * complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetNumberOfNodes The number of nodes that the cluster will have after the resize is
     *         complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withTargetNumberOfNodes(Integer targetNumberOfNodes) {
        this.targetNumberOfNodes = targetNumberOfNodes;
        return this;
    }

    /**
     * The cluster type after the resize is complete. <p>Valid Values:
     * <code>multi-node</code> | <code>single-node</code>
     *
     * @return The cluster type after the resize is complete. <p>Valid Values:
     *         <code>multi-node</code> | <code>single-node</code>
     */
    public String getTargetClusterType() {
        return targetClusterType;
    }
    
    /**
     * The cluster type after the resize is complete. <p>Valid Values:
     * <code>multi-node</code> | <code>single-node</code>
     *
     * @param targetClusterType The cluster type after the resize is complete. <p>Valid Values:
     *         <code>multi-node</code> | <code>single-node</code>
     */
    public void setTargetClusterType(String targetClusterType) {
        this.targetClusterType = targetClusterType;
    }
    
    /**
     * The cluster type after the resize is complete. <p>Valid Values:
     * <code>multi-node</code> | <code>single-node</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetClusterType The cluster type after the resize is complete. <p>Valid Values:
     *         <code>multi-node</code> | <code>single-node</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withTargetClusterType(String targetClusterType) {
        this.targetClusterType = targetClusterType;
        return this;
    }

    /**
     * The status of the resize operation. <p>Valid Values: <code>NONE</code>
     * | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     * <code>SUCCEEDED</code>
     *
     * @return The status of the resize operation. <p>Valid Values: <code>NONE</code>
     *         | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     *         <code>SUCCEEDED</code>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the resize operation. <p>Valid Values: <code>NONE</code>
     * | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     * <code>SUCCEEDED</code>
     *
     * @param status The status of the resize operation. <p>Valid Values: <code>NONE</code>
     *         | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     *         <code>SUCCEEDED</code>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the resize operation. <p>Valid Values: <code>NONE</code>
     * | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     * <code>SUCCEEDED</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the resize operation. <p>Valid Values: <code>NONE</code>
     *         | <code>IN_PROGRESS</code> | <code>FAILED</code> |
     *         <code>SUCCEEDED</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The names of tables that have been completely imported . <p>Valid
     * Values: List of table names.
     *
     * @return The names of tables that have been completely imported . <p>Valid
     *         Values: List of table names.
     */
    public java.util.List<String> getImportTablesCompleted() {
        if (importTablesCompleted == null) {
              importTablesCompleted = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              importTablesCompleted.setAutoConstruct(true);
        }
        return importTablesCompleted;
    }
    
    /**
     * The names of tables that have been completely imported . <p>Valid
     * Values: List of table names.
     *
     * @param importTablesCompleted The names of tables that have been completely imported . <p>Valid
     *         Values: List of table names.
     */
    public void setImportTablesCompleted(java.util.Collection<String> importTablesCompleted) {
        if (importTablesCompleted == null) {
            this.importTablesCompleted = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesCompletedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTablesCompleted.size());
        importTablesCompletedCopy.addAll(importTablesCompleted);
        this.importTablesCompleted = importTablesCompletedCopy;
    }
    
    /**
     * The names of tables that have been completely imported . <p>Valid
     * Values: List of table names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTablesCompleted The names of tables that have been completely imported . <p>Valid
     *         Values: List of table names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withImportTablesCompleted(String... importTablesCompleted) {
        if (getImportTablesCompleted() == null) setImportTablesCompleted(new java.util.ArrayList<String>(importTablesCompleted.length));
        for (String value : importTablesCompleted) {
            getImportTablesCompleted().add(value);
        }
        return this;
    }
    
    /**
     * The names of tables that have been completely imported . <p>Valid
     * Values: List of table names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTablesCompleted The names of tables that have been completely imported . <p>Valid
     *         Values: List of table names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withImportTablesCompleted(java.util.Collection<String> importTablesCompleted) {
        if (importTablesCompleted == null) {
            this.importTablesCompleted = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesCompletedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTablesCompleted.size());
            importTablesCompletedCopy.addAll(importTablesCompleted);
            this.importTablesCompleted = importTablesCompletedCopy;
        }

        return this;
    }

    /**
     * The names of tables that are being currently imported. <p>Valid
     * Values: List of table names.
     *
     * @return The names of tables that are being currently imported. <p>Valid
     *         Values: List of table names.
     */
    public java.util.List<String> getImportTablesInProgress() {
        if (importTablesInProgress == null) {
              importTablesInProgress = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              importTablesInProgress.setAutoConstruct(true);
        }
        return importTablesInProgress;
    }
    
    /**
     * The names of tables that are being currently imported. <p>Valid
     * Values: List of table names.
     *
     * @param importTablesInProgress The names of tables that are being currently imported. <p>Valid
     *         Values: List of table names.
     */
    public void setImportTablesInProgress(java.util.Collection<String> importTablesInProgress) {
        if (importTablesInProgress == null) {
            this.importTablesInProgress = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesInProgressCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTablesInProgress.size());
        importTablesInProgressCopy.addAll(importTablesInProgress);
        this.importTablesInProgress = importTablesInProgressCopy;
    }
    
    /**
     * The names of tables that are being currently imported. <p>Valid
     * Values: List of table names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTablesInProgress The names of tables that are being currently imported. <p>Valid
     *         Values: List of table names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withImportTablesInProgress(String... importTablesInProgress) {
        if (getImportTablesInProgress() == null) setImportTablesInProgress(new java.util.ArrayList<String>(importTablesInProgress.length));
        for (String value : importTablesInProgress) {
            getImportTablesInProgress().add(value);
        }
        return this;
    }
    
    /**
     * The names of tables that are being currently imported. <p>Valid
     * Values: List of table names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTablesInProgress The names of tables that are being currently imported. <p>Valid
     *         Values: List of table names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withImportTablesInProgress(java.util.Collection<String> importTablesInProgress) {
        if (importTablesInProgress == null) {
            this.importTablesInProgress = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesInProgressCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTablesInProgress.size());
            importTablesInProgressCopy.addAll(importTablesInProgress);
            this.importTablesInProgress = importTablesInProgressCopy;
        }

        return this;
    }

    /**
     * The names of tables that have not been yet imported. <p>Valid Values:
     * List of table names
     *
     * @return The names of tables that have not been yet imported. <p>Valid Values:
     *         List of table names
     */
    public java.util.List<String> getImportTablesNotStarted() {
        if (importTablesNotStarted == null) {
              importTablesNotStarted = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              importTablesNotStarted.setAutoConstruct(true);
        }
        return importTablesNotStarted;
    }
    
    /**
     * The names of tables that have not been yet imported. <p>Valid Values:
     * List of table names
     *
     * @param importTablesNotStarted The names of tables that have not been yet imported. <p>Valid Values:
     *         List of table names
     */
    public void setImportTablesNotStarted(java.util.Collection<String> importTablesNotStarted) {
        if (importTablesNotStarted == null) {
            this.importTablesNotStarted = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesNotStartedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTablesNotStarted.size());
        importTablesNotStartedCopy.addAll(importTablesNotStarted);
        this.importTablesNotStarted = importTablesNotStartedCopy;
    }
    
    /**
     * The names of tables that have not been yet imported. <p>Valid Values:
     * List of table names
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTablesNotStarted The names of tables that have not been yet imported. <p>Valid Values:
     *         List of table names
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withImportTablesNotStarted(String... importTablesNotStarted) {
        if (getImportTablesNotStarted() == null) setImportTablesNotStarted(new java.util.ArrayList<String>(importTablesNotStarted.length));
        for (String value : importTablesNotStarted) {
            getImportTablesNotStarted().add(value);
        }
        return this;
    }
    
    /**
     * The names of tables that have not been yet imported. <p>Valid Values:
     * List of table names
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTablesNotStarted The names of tables that have not been yet imported. <p>Valid Values:
     *         List of table names
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeResizeResult withImportTablesNotStarted(java.util.Collection<String> importTablesNotStarted) {
        if (importTablesNotStarted == null) {
            this.importTablesNotStarted = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> importTablesNotStartedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTablesNotStarted.size());
            importTablesNotStartedCopy.addAll(importTablesNotStarted);
            this.importTablesNotStarted = importTablesNotStartedCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTargetNodeType() != null) sb.append("TargetNodeType: " + getTargetNodeType() + ",");
        if (getTargetNumberOfNodes() != null) sb.append("TargetNumberOfNodes: " + getTargetNumberOfNodes() + ",");
        if (getTargetClusterType() != null) sb.append("TargetClusterType: " + getTargetClusterType() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getImportTablesCompleted() != null) sb.append("ImportTablesCompleted: " + getImportTablesCompleted() + ",");
        if (getImportTablesInProgress() != null) sb.append("ImportTablesInProgress: " + getImportTablesInProgress() + ",");
        if (getImportTablesNotStarted() != null) sb.append("ImportTablesNotStarted: " + getImportTablesNotStarted() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTargetNodeType() == null) ? 0 : getTargetNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getTargetNumberOfNodes() == null) ? 0 : getTargetNumberOfNodes().hashCode()); 
        hashCode = prime * hashCode + ((getTargetClusterType() == null) ? 0 : getTargetClusterType().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getImportTablesCompleted() == null) ? 0 : getImportTablesCompleted().hashCode()); 
        hashCode = prime * hashCode + ((getImportTablesInProgress() == null) ? 0 : getImportTablesInProgress().hashCode()); 
        hashCode = prime * hashCode + ((getImportTablesNotStarted() == null) ? 0 : getImportTablesNotStarted().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeResizeResult == false) return false;
        DescribeResizeResult other = (DescribeResizeResult)obj;
        
        if (other.getTargetNodeType() == null ^ this.getTargetNodeType() == null) return false;
        if (other.getTargetNodeType() != null && other.getTargetNodeType().equals(this.getTargetNodeType()) == false) return false; 
        if (other.getTargetNumberOfNodes() == null ^ this.getTargetNumberOfNodes() == null) return false;
        if (other.getTargetNumberOfNodes() != null && other.getTargetNumberOfNodes().equals(this.getTargetNumberOfNodes()) == false) return false; 
        if (other.getTargetClusterType() == null ^ this.getTargetClusterType() == null) return false;
        if (other.getTargetClusterType() != null && other.getTargetClusterType().equals(this.getTargetClusterType()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getImportTablesCompleted() == null ^ this.getImportTablesCompleted() == null) return false;
        if (other.getImportTablesCompleted() != null && other.getImportTablesCompleted().equals(this.getImportTablesCompleted()) == false) return false; 
        if (other.getImportTablesInProgress() == null ^ this.getImportTablesInProgress() == null) return false;
        if (other.getImportTablesInProgress() != null && other.getImportTablesInProgress().equals(this.getImportTablesInProgress()) == false) return false; 
        if (other.getImportTablesNotStarted() == null ^ this.getImportTablesNotStarted() == null) return false;
        if (other.getImportTablesNotStarted() != null && other.getImportTablesNotStarted().equals(this.getImportTablesNotStarted()) == false) return false; 
        return true;
    }
    
}
    