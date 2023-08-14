// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dedicated

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/dirien/pulumi-ovh/sdk/go/ovh"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "ovh:Dedicated/cephAcl:CephAcl":
		r = &CephAcl{}
	case "ovh:Dedicated/nasHAPartition:NasHAPartition":
		r = &NasHAPartition{}
	case "ovh:Dedicated/nasHAPartitionAccess:NasHAPartitionAccess":
		r = &NasHAPartitionAccess{}
	case "ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot":
		r = &NasHAPartitionSnapshot{}
	case "ovh:Dedicated/serverInstallTask:ServerInstallTask":
		r = &ServerInstallTask{}
	case "ovh:Dedicated/serverNetworking:ServerNetworking":
		r = &ServerNetworking{}
	case "ovh:Dedicated/serverRebootTask:ServerRebootTask":
		r = &ServerRebootTask{}
	case "ovh:Dedicated/serverUpdate:ServerUpdate":
		r = &ServerUpdate{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := ovh.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/cephAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/nasHAPartition",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/nasHAPartitionAccess",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/nasHAPartitionSnapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/serverInstallTask",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/serverNetworking",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/serverRebootTask",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"ovh",
		"Dedicated/serverUpdate",
		&module{version},
	)
}