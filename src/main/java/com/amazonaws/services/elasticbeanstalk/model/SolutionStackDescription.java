/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the solution stack.
 * </p>
 */
public class SolutionStackDescription {

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
    private java.util.List<String> permittedFileTypes;

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
            permittedFileTypes = new java.util.ArrayList<String>();
        }
        return permittedFileTypes;
    }
    
    /**
     * The permitted file types allowed for a solution stack.
     *
     * @param permittedFileTypes The permitted file types allowed for a solution stack.
     */
    public void setPermittedFileTypes(java.util.Collection<String> permittedFileTypes) {
        java.util.List<String> permittedFileTypesCopy = new java.util.ArrayList<String>();
        if (permittedFileTypes != null) {
            permittedFileTypesCopy.addAll(permittedFileTypes);
        }
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
        if (getPermittedFileTypes() == null) setPermittedFileTypes(new java.util.ArrayList<String>());
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
        java.util.List<String> permittedFileTypesCopy = new java.util.ArrayList<String>();
        if (permittedFileTypes != null) {
            permittedFileTypesCopy.addAll(permittedFileTypes);
        }
        this.permittedFileTypes = permittedFileTypesCopy;

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
        sb.append("SolutionStackName: " + solutionStackName + ", ");
        sb.append("PermittedFileTypes: " + permittedFileTypes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    