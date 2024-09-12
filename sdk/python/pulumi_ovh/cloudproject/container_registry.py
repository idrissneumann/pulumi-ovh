# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ContainerRegistryArgs', 'ContainerRegistry']

@pulumi.input_type
class ContainerRegistryArgs:
    def __init__(__self__, *,
                 region: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 plan_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ContainerRegistry resource.
        :param pulumi.Input[str] region: Region of the registry
        :param pulumi.Input[str] service_name: The id of the public cloud project. If omitted,
               the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        :param pulumi.Input[str] name: Registry name
        :param pulumi.Input[str] plan_id: Plan ID of the registry
        """
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "service_name", service_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plan_id is not None:
            pulumi.set(__self__, "plan_id", plan_id)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        Region of the registry
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        The id of the public cloud project. If omitted,
        the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Registry name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="planId")
    def plan_id(self) -> Optional[pulumi.Input[str]]:
        """
        Plan ID of the registry
        """
        return pulumi.get(self, "plan_id")

    @plan_id.setter
    def plan_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_id", value)


@pulumi.input_type
class _ContainerRegistryState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan_id: Optional[pulumi.Input[str]] = None,
                 plans: Optional[pulumi.Input[Sequence[pulumi.Input['ContainerRegistryPlanArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ContainerRegistry resources.
        :param pulumi.Input[str] created_at: Plan creation date
        :param pulumi.Input[str] name: Registry name
        :param pulumi.Input[str] plan_id: Plan ID of the registry
        :param pulumi.Input[Sequence[pulumi.Input['ContainerRegistryPlanArgs']]] plans: Plan of the registry
        :param pulumi.Input[str] project_id: Project ID of your registry
        :param pulumi.Input[str] region: Region of the registry
        :param pulumi.Input[str] service_name: The id of the public cloud project. If omitted,
               the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        :param pulumi.Input[int] size: Current size of the registry (bytes)
        :param pulumi.Input[str] status: Registry status
        :param pulumi.Input[str] updated_at: Registry last update date
        :param pulumi.Input[str] url: Access url of the registry
        :param pulumi.Input[str] version: Version of your registry
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plan_id is not None:
            pulumi.set(__self__, "plan_id", plan_id)
        if plans is not None:
            pulumi.set(__self__, "plans", plans)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Plan creation date
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Registry name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="planId")
    def plan_id(self) -> Optional[pulumi.Input[str]]:
        """
        Plan ID of the registry
        """
        return pulumi.get(self, "plan_id")

    @plan_id.setter
    def plan_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_id", value)

    @property
    @pulumi.getter
    def plans(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ContainerRegistryPlanArgs']]]]:
        """
        Plan of the registry
        """
        return pulumi.get(self, "plans")

    @plans.setter
    def plans(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ContainerRegistryPlanArgs']]]]):
        pulumi.set(self, "plans", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project ID of your registry
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        Region of the registry
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the public cloud project. If omitted,
        the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        Current size of the registry (bytes)
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Registry status
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        Registry last update date
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        Access url of the registry
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of your registry
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class ContainerRegistry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a container registry associated with a public cloud project.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_ovh as ovh

        regcap = ovh.CloudProject.get_capabilities_container_filter(service_name="XXXXXX",
            plan_name="SMALL",
            region="GRA")
        my_registry = ovh.cloud_project.ContainerRegistry("my-registry",
            service_name=regcap.service_name,
            plan_id=regcap.id,
            region=regcap.region)
        ```

        > __WARNING__ You can update and migrate to a higher plan at any time but not the contrary.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Registry name
        :param pulumi.Input[str] plan_id: Plan ID of the registry
        :param pulumi.Input[str] region: Region of the registry
        :param pulumi.Input[str] service_name: The id of the public cloud project. If omitted,
               the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ContainerRegistryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a container registry associated with a public cloud project.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_ovh as ovh

        regcap = ovh.CloudProject.get_capabilities_container_filter(service_name="XXXXXX",
            plan_name="SMALL",
            region="GRA")
        my_registry = ovh.cloud_project.ContainerRegistry("my-registry",
            service_name=regcap.service_name,
            plan_id=regcap.id,
            region=regcap.region)
        ```

        > __WARNING__ You can update and migrate to a higher plan at any time but not the contrary.

        :param str resource_name: The name of the resource.
        :param ContainerRegistryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContainerRegistryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plan_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContainerRegistryArgs.__new__(ContainerRegistryArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["plan_id"] = plan_id
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["created_at"] = None
            __props__.__dict__["plans"] = None
            __props__.__dict__["project_id"] = None
            __props__.__dict__["size"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated_at"] = None
            __props__.__dict__["url"] = None
            __props__.__dict__["version"] = None
        super(ContainerRegistry, __self__).__init__(
            'ovh:CloudProject/containerRegistry:ContainerRegistry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            plan_id: Optional[pulumi.Input[str]] = None,
            plans: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ContainerRegistryPlanArgs', 'ContainerRegistryPlanArgsDict']]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'ContainerRegistry':
        """
        Get an existing ContainerRegistry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: Plan creation date
        :param pulumi.Input[str] name: Registry name
        :param pulumi.Input[str] plan_id: Plan ID of the registry
        :param pulumi.Input[Sequence[pulumi.Input[Union['ContainerRegistryPlanArgs', 'ContainerRegistryPlanArgsDict']]]] plans: Plan of the registry
        :param pulumi.Input[str] project_id: Project ID of your registry
        :param pulumi.Input[str] region: Region of the registry
        :param pulumi.Input[str] service_name: The id of the public cloud project. If omitted,
               the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        :param pulumi.Input[int] size: Current size of the registry (bytes)
        :param pulumi.Input[str] status: Registry status
        :param pulumi.Input[str] updated_at: Registry last update date
        :param pulumi.Input[str] url: Access url of the registry
        :param pulumi.Input[str] version: Version of your registry
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContainerRegistryState.__new__(_ContainerRegistryState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["name"] = name
        __props__.__dict__["plan_id"] = plan_id
        __props__.__dict__["plans"] = plans
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region"] = region
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["size"] = size
        __props__.__dict__["status"] = status
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["url"] = url
        __props__.__dict__["version"] = version
        return ContainerRegistry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Plan creation date
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Registry name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="planId")
    def plan_id(self) -> pulumi.Output[str]:
        """
        Plan ID of the registry
        """
        return pulumi.get(self, "plan_id")

    @property
    @pulumi.getter
    def plans(self) -> pulumi.Output[Sequence['outputs.ContainerRegistryPlan']]:
        """
        Plan of the registry
        """
        return pulumi.get(self, "plans")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Project ID of your registry
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        Region of the registry
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        The id of the public cloud project. If omitted,
        the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        Current size of the registry (bytes)
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Registry status
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Registry last update date
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        Access url of the registry
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Version of your registry
        """
        return pulumi.get(self, "version")

