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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * AWS OpsWorks supports five lifecycle events, <b>setup</b> ,
 * <b>configuration</b> ,
 * <b>deploy</b> ,
 * <b>undeploy</b> , and <b>shutdown</b> .
 * For each layer, AWS OpsWorks runs a set of standard recipes for each event. In addition, you can provide custom recipes for any or all layers
 * and events. AWS OpsWorks runs custom event recipes after the standard recipes. <code>LayerCustomRecipes</code> specifies the custom recipes for a
 * particular layer to be run in response to each of the five events.
 * </p>
 * <p>
 * To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name
 * without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
 * </p>
 */
public class Recipes implements Serializable {

    /**
     * An array of custom recipe names to be run following a
     * <code>setup</code> event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> setup;

    /**
     * An array of custom recipe names to be run following a
     * <code>configure</code> event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> configure;

    /**
     * An array of custom recipe names to be run following a
     * <code>deploy</code> event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deploy;

    /**
     * An array of custom recipe names to be run following a
     * <code>undeploy</code> event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> undeploy;

    /**
     * An array of custom recipe names to be run following a
     * <code>shutdown</code> event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> shutdown;

    /**
     * An array of custom recipe names to be run following a
     * <code>setup</code> event.
     *
     * @return An array of custom recipe names to be run following a
     *         <code>setup</code> event.
     */
    public java.util.List<String> getSetup() {
        if (setup == null) {
              setup = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              setup.setAutoConstruct(true);
        }
        return setup;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>setup</code> event.
     *
     * @param setup An array of custom recipe names to be run following a
     *         <code>setup</code> event.
     */
    public void setSetup(java.util.Collection<String> setup) {
        if (setup == null) {
            this.setup = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> setupCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(setup.size());
        setupCopy.addAll(setup);
        this.setup = setupCopy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>setup</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param setup An array of custom recipe names to be run following a
     *         <code>setup</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withSetup(String... setup) {
        if (getSetup() == null) setSetup(new java.util.ArrayList<String>(setup.length));
        for (String value : setup) {
            getSetup().add(value);
        }
        return this;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>setup</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param setup An array of custom recipe names to be run following a
     *         <code>setup</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withSetup(java.util.Collection<String> setup) {
        if (setup == null) {
            this.setup = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> setupCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(setup.size());
            setupCopy.addAll(setup);
            this.setup = setupCopy;
        }

        return this;
    }

    /**
     * An array of custom recipe names to be run following a
     * <code>configure</code> event.
     *
     * @return An array of custom recipe names to be run following a
     *         <code>configure</code> event.
     */
    public java.util.List<String> getConfigure() {
        if (configure == null) {
              configure = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              configure.setAutoConstruct(true);
        }
        return configure;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>configure</code> event.
     *
     * @param configure An array of custom recipe names to be run following a
     *         <code>configure</code> event.
     */
    public void setConfigure(java.util.Collection<String> configure) {
        if (configure == null) {
            this.configure = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> configureCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configure.size());
        configureCopy.addAll(configure);
        this.configure = configureCopy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>configure</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configure An array of custom recipe names to be run following a
     *         <code>configure</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withConfigure(String... configure) {
        if (getConfigure() == null) setConfigure(new java.util.ArrayList<String>(configure.length));
        for (String value : configure) {
            getConfigure().add(value);
        }
        return this;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>configure</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configure An array of custom recipe names to be run following a
     *         <code>configure</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withConfigure(java.util.Collection<String> configure) {
        if (configure == null) {
            this.configure = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> configureCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configure.size());
            configureCopy.addAll(configure);
            this.configure = configureCopy;
        }

        return this;
    }

    /**
     * An array of custom recipe names to be run following a
     * <code>deploy</code> event.
     *
     * @return An array of custom recipe names to be run following a
     *         <code>deploy</code> event.
     */
    public java.util.List<String> getDeploy() {
        if (deploy == null) {
              deploy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deploy.setAutoConstruct(true);
        }
        return deploy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>deploy</code> event.
     *
     * @param deploy An array of custom recipe names to be run following a
     *         <code>deploy</code> event.
     */
    public void setDeploy(java.util.Collection<String> deploy) {
        if (deploy == null) {
            this.deploy = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> deployCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploy.size());
        deployCopy.addAll(deploy);
        this.deploy = deployCopy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>deploy</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploy An array of custom recipe names to be run following a
     *         <code>deploy</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withDeploy(String... deploy) {
        if (getDeploy() == null) setDeploy(new java.util.ArrayList<String>(deploy.length));
        for (String value : deploy) {
            getDeploy().add(value);
        }
        return this;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>deploy</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploy An array of custom recipe names to be run following a
     *         <code>deploy</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withDeploy(java.util.Collection<String> deploy) {
        if (deploy == null) {
            this.deploy = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> deployCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deploy.size());
            deployCopy.addAll(deploy);
            this.deploy = deployCopy;
        }

        return this;
    }

    /**
     * An array of custom recipe names to be run following a
     * <code>undeploy</code> event.
     *
     * @return An array of custom recipe names to be run following a
     *         <code>undeploy</code> event.
     */
    public java.util.List<String> getUndeploy() {
        if (undeploy == null) {
              undeploy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              undeploy.setAutoConstruct(true);
        }
        return undeploy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>undeploy</code> event.
     *
     * @param undeploy An array of custom recipe names to be run following a
     *         <code>undeploy</code> event.
     */
    public void setUndeploy(java.util.Collection<String> undeploy) {
        if (undeploy == null) {
            this.undeploy = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> undeployCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(undeploy.size());
        undeployCopy.addAll(undeploy);
        this.undeploy = undeployCopy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>undeploy</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param undeploy An array of custom recipe names to be run following a
     *         <code>undeploy</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withUndeploy(String... undeploy) {
        if (getUndeploy() == null) setUndeploy(new java.util.ArrayList<String>(undeploy.length));
        for (String value : undeploy) {
            getUndeploy().add(value);
        }
        return this;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>undeploy</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param undeploy An array of custom recipe names to be run following a
     *         <code>undeploy</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withUndeploy(java.util.Collection<String> undeploy) {
        if (undeploy == null) {
            this.undeploy = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> undeployCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(undeploy.size());
            undeployCopy.addAll(undeploy);
            this.undeploy = undeployCopy;
        }

        return this;
    }

    /**
     * An array of custom recipe names to be run following a
     * <code>shutdown</code> event.
     *
     * @return An array of custom recipe names to be run following a
     *         <code>shutdown</code> event.
     */
    public java.util.List<String> getShutdown() {
        if (shutdown == null) {
              shutdown = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              shutdown.setAutoConstruct(true);
        }
        return shutdown;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>shutdown</code> event.
     *
     * @param shutdown An array of custom recipe names to be run following a
     *         <code>shutdown</code> event.
     */
    public void setShutdown(java.util.Collection<String> shutdown) {
        if (shutdown == null) {
            this.shutdown = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> shutdownCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(shutdown.size());
        shutdownCopy.addAll(shutdown);
        this.shutdown = shutdownCopy;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>shutdown</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shutdown An array of custom recipe names to be run following a
     *         <code>shutdown</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withShutdown(String... shutdown) {
        if (getShutdown() == null) setShutdown(new java.util.ArrayList<String>(shutdown.length));
        for (String value : shutdown) {
            getShutdown().add(value);
        }
        return this;
    }
    
    /**
     * An array of custom recipe names to be run following a
     * <code>shutdown</code> event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shutdown An array of custom recipe names to be run following a
     *         <code>shutdown</code> event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Recipes withShutdown(java.util.Collection<String> shutdown) {
        if (shutdown == null) {
            this.shutdown = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> shutdownCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(shutdown.size());
            shutdownCopy.addAll(shutdown);
            this.shutdown = shutdownCopy;
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
        if (getSetup() != null) sb.append("Setup: " + getSetup() + ",");
        if (getConfigure() != null) sb.append("Configure: " + getConfigure() + ",");
        if (getDeploy() != null) sb.append("Deploy: " + getDeploy() + ",");
        if (getUndeploy() != null) sb.append("Undeploy: " + getUndeploy() + ",");
        if (getShutdown() != null) sb.append("Shutdown: " + getShutdown() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSetup() == null) ? 0 : getSetup().hashCode()); 
        hashCode = prime * hashCode + ((getConfigure() == null) ? 0 : getConfigure().hashCode()); 
        hashCode = prime * hashCode + ((getDeploy() == null) ? 0 : getDeploy().hashCode()); 
        hashCode = prime * hashCode + ((getUndeploy() == null) ? 0 : getUndeploy().hashCode()); 
        hashCode = prime * hashCode + ((getShutdown() == null) ? 0 : getShutdown().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Recipes == false) return false;
        Recipes other = (Recipes)obj;
        
        if (other.getSetup() == null ^ this.getSetup() == null) return false;
        if (other.getSetup() != null && other.getSetup().equals(this.getSetup()) == false) return false; 
        if (other.getConfigure() == null ^ this.getConfigure() == null) return false;
        if (other.getConfigure() != null && other.getConfigure().equals(this.getConfigure()) == false) return false; 
        if (other.getDeploy() == null ^ this.getDeploy() == null) return false;
        if (other.getDeploy() != null && other.getDeploy().equals(this.getDeploy()) == false) return false; 
        if (other.getUndeploy() == null ^ this.getUndeploy() == null) return false;
        if (other.getUndeploy() != null && other.getUndeploy().equals(this.getUndeploy()) == false) return false; 
        if (other.getShutdown() == null ^ this.getShutdown() == null) return false;
        if (other.getShutdown() != null && other.getShutdown().equals(this.getShutdown()) == false) return false; 
        return true;
    }
    
}
    