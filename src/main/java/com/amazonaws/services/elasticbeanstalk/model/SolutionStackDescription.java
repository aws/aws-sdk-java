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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the solution stack.
 * </p>
 */
public class SolutionStackDescription implements Serializable {

    /**
     * The name of the solution stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * The permitted file types allowed for a solution stack.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> permittedFileTypes;

    /**
     * The name of the solution stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The name of the solution stack.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * The name of the solution stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * The name of the solution stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SolutionStackDescription withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * The permitted file types allowed for a solution stack.
     *
     * @return The permitted file types allowed for a solution stack.
     */
    public java.util.List<String> getPermittedFileTypes() {
        if (permittedFileTypes == null) {
              permittedFileTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              permittedFileTypes.setAutoConstruct(true);
        }
        return permittedFileTypes;
    }
    
    /**
     * The permitted file types allowed for a solution stack.
     *
     * @param permittedFileTypes The permitted file types allowed for a solution stack.
     */
    public void setPermittedFileTypes(java.util.Collection<String> permittedFileTypes) {
        if (permittedFileTypes == null) {
            this.permittedFileTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> permittedFileTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(permittedFileTypes.size());
        permittedFileTypesCopy.addAll(permittedFileTypes);
        this.permittedFileTypes = permittedFileTypesCopy;
    }
    
    /**
     * The permitted file types allowed for a solution stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param permittedFileTypes The permitted file types allowed for a solution stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SolutionStackDescription withPermittedFileTypes(String... permittedFileTypes) {
        if (getPermittedFileTypes() == null) setPermittedFileTypes(new java.util.ArrayList<String>(permittedFileTypes.length));
        for (String value : permittedFileTypes) {
            getPermittedFileTypes().add(value);
        }
        return this;
    }
    
    /**
     * The permitted file types allowed for a solution stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param permittedFileTypes The permitted file types allowed for a solution stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SolutionStackDescription withPermittedFileTypes(java.util.Collection<String> permittedFileTypes) {
        if (permittedFileTypes == null) {
            this.permittedFileTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> permittedFileTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(permittedFileTypes.size());
            permittedFileTypesCopy.addAll(permittedFileTypes);
            this.permittedFileTypes = permittedFileTypesCopy;
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
        if (getSolutionStackName() != null) sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPermittedFileTypes() != null) sb.append("PermittedFileTypes: " + getPermittedFileTypes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode()); 
        hashCode = prime * hashCode + ((getPermittedFileTypes() == null) ? 0 : getPermittedFileTypes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SolutionStackDescription == false) return false;
        SolutionStackDescription other = (SolutionStackDescription)obj;
        
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null) return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false) return false; 
        if (other.getPermittedFileTypes() == null ^ this.getPermittedFileTypes() == null) return false;
        if (other.getPermittedFileTypes() != null && other.getPermittedFileTypes().equals(this.getPermittedFileTypes()) == false) return false; 
        return true;
    }
    
}
    