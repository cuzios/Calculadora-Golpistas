// Valores dos componentes
const componentValues = {
    fiveSeven: 562,
    m1911: 648,
    mk2: 723,
    parafal: 876,
    golpistas: 680,
    mpy: 723,
    remington: 723,
    uzi: 595
};

function calculate() {
    // Obter quantidades
    const quantities = {
        fiveSeven: parseInt(document.getElementById('fiveSeven').value),
        m1911: parseInt(document.getElementById('m1911').value),
        mk2: parseInt(document.getElementById('mk2').value),
        parafal: parseInt(document.getElementById('parafal').value),
        g3: parseInt(document.getElementById('g3').value),
        mpx: parseInt(document.getElementById('mpx').value),
        remington: parseInt(document.getElementById('remington').value),
        uzi: parseInt(document.getElementById('uzi').value)
    };

    // Calcular valor total
    let total = 0;
    for (const [component, quantity] of Object.entries(quantities)) {
        total += quantity * componentValues[component];
    }

    // Cálculos das porcentagens
    const total100 = total; // 100%
    const total90 = total * 0.9; // 90%
    const total80 = total * 0.8; // 80%

    // Exibir resultados
    document.getElementById('resultTotal').textContent = `Valor Total: R$ ${total.toFixed(2)}`;
    document.getElementById('result100').textContent = `100% de R$ ${total.toFixed(2)} = R$ ${total100.toFixed(2)}`;
    document.getElementById('result90').textContent = `90% de R$ ${total.toFixed(2)} = R$ ${total90.toFixed(2)}`;
    document.getElementById('result80').textContent = `80% de R$ ${total.toFixed(2)} = R$ ${total80.toFixed(2)}`;
}
