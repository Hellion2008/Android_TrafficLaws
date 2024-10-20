package ru.urban.android_trafficlaws

class TrafficLaws {
    private val _laws = "1. Участники дорожного движения обязаны знать и соблюдать относящиеся к ним требования Правил, сигналов светофоров, знаков и разметки, а также выполнять распоряжения регулировщиков, действующих в пределах предоставленных им прав и регулирующих дорожное движение установленными сигналами.\n" +
            "2. На дорогах установлено правостороннее движение транспортных средств.\n" +
            "3. Лица, нарушившие Правила 2024, несут ответственность в соответствии с действующим законодательством."
    val laws: String
        get() = _laws
}