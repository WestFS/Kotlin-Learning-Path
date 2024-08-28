package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model

import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.`interface`.ConservationEfficiency

abstract class MarineConservation:ConservationEfficiency {
    private var typeEnvironment:String?=null
    private var protectedAreaInKm2:Double?= 0.0
    private var hasMonitoringProgram:Boolean?= false
    private var reserveType:EnumMarineReserveType?=null




    fun getTypeEnvironment(): String? {
        return typeEnvironment
    }
    fun setTypeEnvironment(typeEnvironment:String?) {
        this.typeEnvironment = typeEnvironment
    }
    fun getProtectedAreaInKm2():Double?{
        return protectedAreaInKm2
    }

    fun setProtectedAreaInKm2(protectedAreaInKm2:Double?){
        this.protectedAreaInKm2 = protectedAreaInKm2
    }
    fun getHasMonitoringProgram():Boolean?{
        return hasMonitoringProgram
    }
    fun setHasMonitoringProgram(hasMonitoringProgram: Boolean?){
        this.hasMonitoringProgram=hasMonitoringProgram
    }
}