/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.deltacloud;

import java.util.List;
import java.util.Properties;

import org.jclouds.compute.ComputeServiceContextBuilder;
import org.jclouds.deltacloud.compute.config.DeltacloudComputeServiceContextModule;
import org.jclouds.deltacloud.config.DeltacloudRestClientModule;

import com.google.inject.Module;

/**
 * 
 * @author Adrian Cole
 */
public class DeltacloudContextBuilder extends ComputeServiceContextBuilder<DeltacloudClient, DeltacloudAsyncClient> {

   public DeltacloudContextBuilder(Properties props) {
      super(DeltacloudClient.class, DeltacloudAsyncClient.class, props);
   }

   @Override
   protected void addContextModule(List<Module> modules) {
      modules.add(new DeltacloudComputeServiceContextModule());
   }

   protected void addClientModule(List<Module> modules) {
      modules.add(new DeltacloudRestClientModule());
   }

}
